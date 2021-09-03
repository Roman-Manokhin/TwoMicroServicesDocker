package ru.rmanokhin.microsocial.service;

import ru.rmanokhin.microsocial.model.Social;

public interface SocialService {

    Social incrementSocialCount(Long id, Boolean inc);

}
