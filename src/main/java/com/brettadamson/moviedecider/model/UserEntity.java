package com.brettadamson.moviedecider.model;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "user_table")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Long id;
    @Column(name = "username")
    private String username;
    @Column(name = "creation_date")
    private Date creationDate;

    public UserEntity(){
        creationDate = new Date();
    }
    public UserEntity(Long id, String username){
        this.id = id;
        this.username = username;
        creationDate = new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }
    public Date getCreationDate() {
        return creationDate;
    }






}
