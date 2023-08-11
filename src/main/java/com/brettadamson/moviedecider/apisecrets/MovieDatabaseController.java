package com.brettadamson.moviedecider.apisecrets;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
@RestController
@RequestMapping("/movie-database")
public class MovieDatabaseController {
//TODO remove this class?

    private final MovieDatabaseConfigProperties movieDatabaseConfig;

    public MovieDatabaseController(MovieDatabaseConfigProperties movieDatabaseConfig){
        this.movieDatabaseConfig = movieDatabaseConfig;
    }


}
