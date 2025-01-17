package com.security.study_security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.security.study_security.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    User findByUsername(String username);
}