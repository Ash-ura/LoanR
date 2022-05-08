package com.Ashura.LoanR.domain.service;

import com.Ashura.LoanR.domain.exception.LoanApplicationNotFoundException;
import com.Ashura.LoanR.domain.exception.UserNotFoundException;
import com.Ashura.LoanR.domain.model.Loan;
import com.Ashura.LoanR.domain.model.LoanApplication;
import com.Ashura.LoanR.domain.model.User;
import com.Ashura.LoanR.domain.repository.LoanApplicationRepository;
import com.Ashura.LoanR.domain.repository.LoanRepository;
import com.Ashura.LoanR.domain.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoanService {

    private final LoanApplicationRepository loanApplicationRepository;
    private final UserRepository userRepository;
    private final LoanRepository loanRepository;


    @Autowired
    public LoanService(LoanApplicationRepository loanApplicationRepository, UserRepository userRepository, LoanRepository loanRepository) {
        this.loanApplicationRepository = loanApplicationRepository;
        this.userRepository = userRepository;
        this.loanRepository = loanRepository;
    }

    
    public void acceptLoan(final long loanApplicationId, final long lenderId){
        User lender = userRepository.findById(lenderId).orElseThrow(() -> new UserNotFoundException(lenderId));
        LoanApplication loanApplication = loanApplicationRepository.findById(loanApplicationId).orElseThrow(() -> new LoanApplicationNotFoundException(loanApplicationId));
        loanRepository.save(new Loan(lender, loanApplication));
    }
}
