package com.brettadamson.moviedecider.services;

import com.brettadamson.moviedecider.model.UserEntity;

import java.util.Optional;

public interface UserService {

    Optional<UserEntity> findById(Long id);
    UserEntity saveUser(UserEntity userEntity);
    UserEntity updateUser(UserEntity userEntity);
    void deleteUser(Long id);
}
