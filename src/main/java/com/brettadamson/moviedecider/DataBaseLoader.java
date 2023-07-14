//package com.brettadamson.moviedecider;
//
//
//import com.brettadamson.moviedecider.model.Movie;
//import com.brettadamson.moviedecider.model.User;
//import com.brettadamson.moviedecider.repositories.UserRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class DataBaseLoader implements CommandLineRunner {
//    private final UserRepository userRepository;
//
//    public DataBaseLoader(UserRepository userRepository){
//        this.userRepository = userRepository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception{
//        User u1 = new User("Brett");
//        Movie m1 = new Movie("Movie-Name");
//        userRepository.save(u1);
//    }
//
//}
