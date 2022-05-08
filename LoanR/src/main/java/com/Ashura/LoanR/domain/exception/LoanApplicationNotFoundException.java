package com.Ashura.LoanR.domain.exception;

public class LoanApplicationNotFoundException extends RuntimeException{
    public LoanApplicationNotFoundException(long loanApplicationId) {
        super("Loan application with Id " + loanApplicationId + " not found!");
    }
}
