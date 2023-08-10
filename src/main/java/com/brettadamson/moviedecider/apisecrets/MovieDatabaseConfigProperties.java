package com.brettadamson.moviedecider.apisecrets;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("movie-database")
public record MovieDatabaseConfigProperties(String apiKey) {
}
