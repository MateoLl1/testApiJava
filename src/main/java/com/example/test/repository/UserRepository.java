package com.example.test.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.test.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
    
}
