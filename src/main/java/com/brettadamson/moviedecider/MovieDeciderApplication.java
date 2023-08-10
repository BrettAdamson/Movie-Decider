package com.brettadamson.moviedecider;

import com.brettadamson.moviedecider.apisecrets.MovieDatabaseConfigProperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({MovieDatabaseConfigProperties.class})
public class MovieDeciderApplication {


	public static void main(String[] args) {
		SpringApplication.run(MovieDeciderApplication.class, args);
	}
}
