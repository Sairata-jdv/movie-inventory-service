package com.movie_inventory.model;

import jakarta.persistence.*;

@Entity
@Table(name = "multiplex_registration")
public class Multiplex {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nameOfMultiplex;

    private String password;
    private int noOfMovieHall;
    private String phoneNo;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getNameOfMultiplex() {
        return nameOfMultiplex;
    }

    public void setNameOfMultiplex(String nameOfMultiplex) {
        this.nameOfMultiplex = nameOfMultiplex;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getNoOfMovieHall() {
        return noOfMovieHall;
    }

    public void setNoOfMovieHall(int noOfMovieHall) {
        this.noOfMovieHall = noOfMovieHall;
    }
}
