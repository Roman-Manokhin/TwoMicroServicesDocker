package ru.rmanokhin.microsocial.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.rmanokhin.microsocial.model.Social;

import java.util.Optional;

public interface SocialRepository extends JpaRepository<Social, Long> {

    Optional<Social> getSocialByGameId(Long id);

}
