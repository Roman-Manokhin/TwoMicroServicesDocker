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
    public synchronized Social incrementSocialCount(Long id, Boolean inc) {
        Optional<Social> social = socialRepository.getSocialByGameId(id);
        if (inc) {
            if (social.isEmpty()) {
                social = Optional.of(new Social(1L, id));
            } else {
                social.get().increment();
            }
            return socialRepository.save(social.get());
        }
        return social.get();
    }


}
