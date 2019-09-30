package com.example.spottunes.repository;

import com.example.spottunes.model.UserRole;
import org.springframework.data.repository.CrudRepository;

public interface UserRoleRepository extends CrudRepository<UserRole, Integer> {

    public UserRole findByName(String name);
}