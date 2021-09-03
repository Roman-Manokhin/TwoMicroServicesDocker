package ru.rmanokhin.microsocial.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.rmanokhin.microsocial.model.Social;
import ru.rmanokhin.microsocial.repository.SocialRepository;
import ru.rmanokhin.microsocial.service.SocialService;

import java.util.Optional;

@Service
@AllArgsConstructor
public class SocialServiceImpl implements SocialService {

    private final SocialRepository socialRepository;

    @Override
    public Social incrementSocialCount(Long id, Boolean inc) {
        Optional<Social> socialOptional = socialRepository.getSocialByGameId(id);
        Social social;
        if (inc) {
            if (socialOptional.isEmpty()) {
                social = new Social(1L, id);
            } else {
                social = socialOptional.get();
                social.increment();
            }
            return socialRepository.save(social);
        } else {
            return socialRepository.getSocialByGameId(id).get();
        }

    }



}
