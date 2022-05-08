package com.Ashura.LoanR.domain.repository;

import com.Ashura.LoanR.domain.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>{
    
}
