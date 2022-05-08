package com.Ashura.LoanR.domain.exception;

public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(long userId) {
        super("User with Id " + userId + " not found!");
    }
    
}
