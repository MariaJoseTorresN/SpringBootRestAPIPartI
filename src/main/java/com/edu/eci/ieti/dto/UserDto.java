package com.edu.eci.ieti.dto;

import com.edu.eci.ieti.entities.User;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserDto {
    private String id;
    private String name;
    private String email;
    private String lastName;
    private String createdAt;

    public UserDto(String id, String name, String email, String lastName, String createdAt) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.lastName = lastName;
        this.createdAt = createdAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getLastname() {
        return lastName;
    }

    public void setLastname(String lastName) {
        this.lastName = lastName;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public UserDto(){}

    public User toEntity(){
        try {
            return new User(id, name, email, lastName, new SimpleDateFormat("dd/MM/yyyy").parse(createdAt));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}