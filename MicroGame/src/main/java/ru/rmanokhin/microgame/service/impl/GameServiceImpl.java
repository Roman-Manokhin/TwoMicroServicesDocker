package ru.rmanokhin.microgame.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import ru.rmanokhin.microgame.model.Game;
import ru.rmanokhin.microgame.repository.GameRepository;
import ru.rmanokhin.microgame.service.GameService;


@Service
@AllArgsConstructor
public class GameServiceImpl implements GameService {

    private final GameRepository gameRepository;
    private final WebClient webClient;


    @Override
    public void createGame(Game game) {
        gameRepository.save(game);
    }

    @Override
    public Game getGameById(Long id) {
        return gameRepository.findById(id).orElse(null);
    }

    @Override
    public void goToSocialServiceWebClient(Long id) {

        webClient.get()
                .uri(uriBuilder -> uriBuilder.path("/" + id)
                        .queryParam("increment", "true")
                        .build())
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }


}
