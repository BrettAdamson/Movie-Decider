package com.brettadamson.moviedecider.repositories;



import com.brettadamson.moviedecider.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
