package com.meteo.userservice.model;

import jakarta.persistence.*;

@Entity
@Table(name = "\"user\"")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;

    // Constructeurs, getters et setters

    public User() {
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters et setters pour tous les champs

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
