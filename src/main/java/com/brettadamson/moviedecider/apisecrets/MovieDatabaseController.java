package com.brettadamson.moviedecider.apisecrets;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
@RestController
@RequestMapping("/movie-database")
public class MovieDatabaseController {

    private final MovieDatabaseConfigProperties movieDatabaseConfig;

    public MovieDatabaseController(MovieDatabaseConfigProperties movieDatabaseConfig){
        this.movieDatabaseConfig = movieDatabaseConfig;
    }

    @GetMapping
    public Map<String,String> printAllProps() {
        return Map.of("apiKey", movieDatabaseConfig.apiKey());
    }
}
