package com.entelgy.excercise.controller;

import com.entelgy.excercise.entity.ResponseA;
import com.entelgy.excercise.entity.ResponseB;
import com.entelgy.excercise.service.CharacterService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.web.reactive.function.BodyInserters;
import reactor.core.publisher.Mono;

import java.util.ArrayList;


@ExtendWith(SpringExtension.class)
@WebFluxTest(controllers = CharacterController.class)
@Import(CharacterService.class)
class CharacterControllerTest {

    @MockBean
    CharacterService characterService;

    @Autowired
    private WebTestClient webClient;

    @Test
    void shouldReturnOkStatus() {

        ResponseB character = new ResponseB(new ResponseA(new ArrayList<>()));

        Mockito.when(characterService.getCharacteresFromURI())
                .thenReturn(Mono.just(character));

        webClient.post()
                .uri("/")
                .contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromObject(character))
                .exchange()
                .expectStatus().isOk();

    }
}
