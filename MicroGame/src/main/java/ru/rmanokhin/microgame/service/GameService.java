package ru.rmanokhin.microgame.service;

import ru.rmanokhin.microgame.model.Game;

public interface GameService {

    void createGame(Game game);

    Game getGameById(Long id);

    void goToSocialServiceWebClient(Long id);

}
