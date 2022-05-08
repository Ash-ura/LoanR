package com.Ashura.LoanR.domain.repository;

import com.Ashura.LoanR.domain.model.Loan;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan,Long>{
    
}
