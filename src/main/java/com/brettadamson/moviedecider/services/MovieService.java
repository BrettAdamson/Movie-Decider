package com.brettadamson.moviedecider.services;

import com.brettadamson.moviedecider.apisecrets.MovieDatabaseController;
import com.brettadamson.moviedecider.dao.MovieDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.ArrayList;
import java.util.List;

@Service

public class MovieService {

    @Value("${movie-database.api-key}")
    private String apiKey;

    private final WebClient movieClient;
    private List<MovieDao> movieList;


    public MovieService(){
        movieClient = WebClient.create("https://api.themoviedb.org/3/movie/11");
        movieList = new ArrayList<MovieDao>();
    }

    public List<MovieDao> getMovieList() {
        //TODO consider if this is the best implementation to save a list of movies that the user searches for in a session?
        
        return movieList;
    }

    public MovieDao getMovie(){
        MovieDao movie  = movieClient
                .get()
                .uri(uriBuilder -> uriBuilder
                        .path("").queryParam("api_key",apiKey).build())
                .retrieve()
                .bodyToMono(MovieDao.class)
                .block();
        movieList.add(movie);
        return movie;
    }




}
