package com.example.demorestapi.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // No need to map @Column it will use param name default
    private String firstName;
    private String lastName;

    public User(){

    } // defult constucter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    } // Parameter constucter

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
