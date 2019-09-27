package com.example.spottunes.repository;
import com.example.spottunes.model.User;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
    @Query("FROM User u WHERE u.username = ?1 and u.password = ?2")
    public User login(String username, String password);
}
