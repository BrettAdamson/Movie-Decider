package com.brettadamson.moviedecider.services;

import com.brettadamson.moviedecider.apisecrets.MovieDatabaseController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service

public class MovieService {

    @Value("${movie-database.api-key}")
    private String apiKey;

    private final WebClient movieClient;


    public MovieService(){
        movieClient = WebClient.create("https://api.themoviedb.org/3/movie/11");
    }


    public String getMovie(){

        String movie  = movieClient
                .get()
                .uri(uriBuilder -> uriBuilder
                        .path("").queryParam("api_key",apiKey).build())
                .retrieve()
                .bodyToMono(String.class)
                .block();

        return movie;
    }




}
