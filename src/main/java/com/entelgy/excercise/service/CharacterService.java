package com.entelgy.excercise.service;

import com.entelgy.excercise.entity.CharacterEntity;
import com.entelgy.excercise.entity.ResponseA;
import com.entelgy.excercise.entity.ResponseB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CharacterService {
    @Value("${character.uri}")
    private String uri;

    private WebClient client;

    @Autowired
    public CharacterService(WebClient client) {
        this.client = client;
    }

    public ResponseB transferToList(List<CharacterEntity> characteres){
        return new ResponseB(new ResponseA(characteres.stream()
                .map(characterEntity -> characterEntity.getSpecies() + ", "
                + characterEntity.getOriginPlanet() + ", "
                + characterEntity.getName())
                .collect(Collectors.toList())
        ));
    }
    public Mono<ResponseB> getCharacteresFromURI() {

        return client.get().uri(uri)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToFlux(CharacterEntity.class)
                .collectList()
                .map(this::transferToList);
    }

}
