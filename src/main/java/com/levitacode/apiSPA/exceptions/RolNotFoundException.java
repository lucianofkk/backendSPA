package com.levitacode.apiSPA.exceptions;

public class RolNotFoundException extends RuntimeException {
    public RolNotFoundException(String message) {
        super (message);
    }
}