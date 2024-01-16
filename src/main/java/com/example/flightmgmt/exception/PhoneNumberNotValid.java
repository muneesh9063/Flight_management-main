package com.example.flightmgmt.exception;

public class PhoneNumberNotValid extends RuntimeException{
    public PhoneNumberNotValid(String message){
        super(message);
    }
}