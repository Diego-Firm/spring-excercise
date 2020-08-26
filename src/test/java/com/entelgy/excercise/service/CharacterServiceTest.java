package com.entelgy.excercise.service;

import com.entelgy.excercise.entity.CharacterEntity;
import com.entelgy.excercise.entity.ResponseA;
import com.entelgy.excercise.entity.ResponseB;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CharacterServiceTest {
    CharacterService characterService;

    @Test
    void shoulObtainAResponseEqualsToDummyResponse() {
        characterService = new CharacterService(null);
        CharacterEntity characterEntity1 = new CharacterEntity();
        characterEntity1.setName("Goku");
        characterEntity1.setSpecies("Saiyan");
        characterEntity1.setOriginPlanet("Vegeta");
        List<CharacterEntity> characteres = new ArrayList<>();
        List<String> characteresStrs = new ArrayList<>();
        characteresStrs.add("Saiyan, Vegeta, Goku");
        characteres.add(characterEntity1);
        ResponseB responseBObtained = characterService.transferToList(characteres);
        ResponseB responseBToTest = new ResponseB(new ResponseA(characteresStrs));
        assertEquals(responseBObtained, responseBToTest);
    }
}
