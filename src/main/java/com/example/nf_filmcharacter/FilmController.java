package com.example.nf_filmcharacter;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/filmcharacters")
@RequiredArgsConstructor
public class FilmController {

    private final FilmService service;

    @GetMapping
    FilmCharacter getFilmCharacter(){
        return service.getFilmCharacter();
    }

}
