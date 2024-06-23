package com.dino.user_service.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import com.dino.user_service.entity.User;

@Repository
public interface UserRepository extends Neo4jRepository<User, String> {}