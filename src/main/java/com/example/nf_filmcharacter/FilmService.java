package com.example.nf_filmcharacter;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Objects;

@Service
public class FilmService {
    private final WebClient webClient = WebClient.create("https://akabab.github.io/starwars-api/api");
    ResponseEntity<FilmCharacter> responseEntity;
    FilmCharacter getFilmCharacter(){
        webClient
                .get()
                .uri("/id/1.json")
                .retrieve()
                .toEntity(FilmCharacter.class)
                .block();

                return Objects.requireNonNull(responseEntity).getBody();
    }

}
