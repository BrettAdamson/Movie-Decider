package com.brettadamson.moviedecider.services;


import com.brettadamson.moviedecider.model.UserEntity;
import com.brettadamson.moviedecider.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @Override
    public Optional<UserEntity> findById(Long id) {
        return  userRepository.findById(id);
    }

    @Override
    public UserEntity saveUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    @Override
    public UserEntity updateUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    @Override
    public void deleteUser(Long id) {
    userRepository.deleteById(id);
    }
}
