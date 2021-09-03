package ru.rmanokhin.microgame.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.rmanokhin.microgame.model.Game;
import ru.rmanokhin.microgame.service.GameService;


@RestController
@AllArgsConstructor
public class GameController {

    private final GameService gameService;

    @GetMapping("/{id}")
    public Game getItemById(@PathVariable Long id) {

        gameService.goToSocialServiceWebClient(id);

        return gameService.getGameById(id);
    }

}
