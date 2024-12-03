package com.security.study_security.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.security.study_security.entity.Authority;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
