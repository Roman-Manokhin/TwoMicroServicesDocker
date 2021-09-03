package ru.rmanokhin.microsocial.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.rmanokhin.microsocial.model.Social;
import ru.rmanokhin.microsocial.service.SocialService;

@RestController
@AllArgsConstructor
public class SocialController {

    private final SocialService socialService;

    @GetMapping("/{id}")
    private Social getSocialById(@PathVariable Long id, @RequestParam("increment") Boolean inc){
        return socialService.incrementSocialCount(id, inc);
    }






}
