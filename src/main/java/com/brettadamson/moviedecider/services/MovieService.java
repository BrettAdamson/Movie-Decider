package com.brettadamson.moviedecider.services;

import com.brettadamson.moviedecider.apisecrets.MovieDatabaseController;
import com.brettadamson.moviedecider.dao.MovieDao;
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

        MovieDao movie  = movieClient
                .get()
                .uri(uriBuilder -> uriBuilder
                        .path("").queryParam("api_key",apiKey).build())
                .retrieve()
                .bodyToMono(MovieDao.class)
                .block();

        return movie.toString();
    }




}
