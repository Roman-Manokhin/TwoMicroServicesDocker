package ru.rmanokhin.microgame.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.rmanokhin.microgame.model.Game;


public interface GameRepository extends JpaRepository<Game, Long> {

}
