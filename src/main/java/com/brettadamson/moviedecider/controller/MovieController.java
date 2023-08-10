package com.brettadamson.moviedecider.controller;


import com.brettadamson.moviedecider.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;
    @GetMapping("/movie")
    public String getMovie(){
        String movie = movieService.getMovie();
        return movie;
    }
}
