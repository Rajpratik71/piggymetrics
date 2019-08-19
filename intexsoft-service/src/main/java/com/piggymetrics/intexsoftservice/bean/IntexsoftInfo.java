package com.piggymetrics.intexsoftservice.bean;

import java.time.LocalDateTime;

public class IntexsoftInfo {
    private String name;
    private String surname;
    private LocalDateTime currentDateTime;

    protected IntexsoftInfo() {
    }

    public IntexsoftInfo(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.currentDateTime = LocalDateTime.now();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDateTime getCurrentDateTime() {
        return currentDateTime;
    }
}
