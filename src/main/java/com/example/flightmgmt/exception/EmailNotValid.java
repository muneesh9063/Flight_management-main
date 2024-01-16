package com.example.flightmgmt.exception;

public class EmailNotValid extends RuntimeException{
    public EmailNotValid(String message){
        super(message);
    }
}
