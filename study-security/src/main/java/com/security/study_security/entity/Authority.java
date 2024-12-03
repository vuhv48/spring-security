package com.security.study_security.entity;

import org.springframework.security.core.GrantedAuthority;

import jakarta.persistence.*;

@Entity
@Table(name = "authorities")
public class Authority implements GrantedAuthority  {

    @Id
    @Column(nullable = false)
    private String authority;

    public Authority() {}

    public Authority(String authority) {
        this.authority = authority;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
