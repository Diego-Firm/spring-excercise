package com.entelgy.excercise.controller;


import com.entelgy.excercise.entity.ResponseB;
import com.entelgy.excercise.service.CharacterService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;

@RestController
public class CharacterController {


    @Resource
    private CharacterService characterService;

    @PostMapping(path = "/", produces=MediaType.APPLICATION_JSON_VALUE)
    public Mono<ResponseB> characters() {
        return characterService.getCharacteresFromURI();
    }

}
