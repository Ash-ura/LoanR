package com.Ashura.LoanR.domain.service;

import java.util.Optional;

import com.Ashura.LoanR.application.model.LoanRequest;
import com.Ashura.LoanR.domain.exception.UserNotFoundException;
import com.Ashura.LoanR.domain.model.LoanApplication;
import com.Ashura.LoanR.domain.model.User;
import com.Ashura.LoanR.domain.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoanApplicationAdapter {

    private final UserRepository userRepository;

    @Autowired
    public LoanApplicationAdapter(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    public LoanApplication transform(LoanRequest request) {
        Optional<User> userOptional = userRepository.findById(request.getBorrowerId());

        if(userOptional.isPresent()){
           return new LoanApplication(request.getAmount(), 
           userOptional.get(), 
           request.getDaysToRepay(), 
           request.getInterestRate());
        } else{
            throw new UserNotFoundException(request.getBorrowerId());
        }
        
    }
}

