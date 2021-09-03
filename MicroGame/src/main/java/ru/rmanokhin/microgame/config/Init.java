package ru.rmanokhin.microgame.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rmanokhin.microgame.model.Game;
import ru.rmanokhin.microgame.service.GameService;

import javax.annotation.PostConstruct;

@Component
public class Init {

    private final GameService gameService;

    @Autowired
    public Init(GameService gameService) {
        this.gameService = gameService;
    }

    @PostConstruct
    public void init(){

        Game game = new Game("Warcraft");
        Game game1 = new Game("StarCraft");
        Game game2 = new Game("Diablo");

        gameService.createGame(game);
        gameService.createGame(game1);
        gameService.createGame(game2);

    }
}
