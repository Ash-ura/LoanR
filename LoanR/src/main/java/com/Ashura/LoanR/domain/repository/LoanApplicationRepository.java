package com.Ashura.LoanR.domain.repository;

import com.Ashura.LoanR.domain.model.LoanApplication;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanApplicationRepository extends JpaRepository<LoanApplication,Long>{
    
}
