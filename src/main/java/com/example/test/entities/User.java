package com.example.test.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_users")
public class User {

    @Id
    private Long us_id;

    private String us_name;
    private int us_age;
    private String us_email;

    // Getters and Setters
    public Long getUs_id() {
        return us_id;
    }

    public void setUs_id(Long us_id) {
        this.us_id = us_id;
    }

    public String getUs_name() {
        return us_name;
    }

    public void setUs_name(String us_name) {
        this.us_name = us_name;
    }

    public int getUs_age() {
        return us_age;
    }

    public void setUs_age(int us_age) {
        this.us_age = us_age;
    }

    public String getUs_email() {
        return us_email;
    }

    public void setUs_email(String us_email) {
        this.us_email = us_email;
    }
}

