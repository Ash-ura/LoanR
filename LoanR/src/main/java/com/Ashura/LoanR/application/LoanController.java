package com.Ashura.LoanR.application;

import java.util.List;

import com.Ashura.LoanR.application.model.LoanRequest;
import com.Ashura.LoanR.domain.model.LoanApplication;
import com.Ashura.LoanR.domain.model.User;
import com.Ashura.LoanR.domain.repository.LoanApplicationRepository;
import com.Ashura.LoanR.domain.repository.UserRepository;
import com.Ashura.LoanR.domain.service.LoanApplicationAdapter;
import com.Ashura.LoanR.domain.service.LoanService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {

    private final LoanApplicationRepository loanApplicationRepository;
    private final UserRepository userRepository;
    private final LoanApplicationAdapter loanApplicationAdapter;
    private final LoanService loanService;

    

    @Autowired
    public LoanController(LoanApplicationRepository loanApplicationRepository, UserRepository userRepository, LoanApplicationAdapter loanApplicationAdapter, LoanService loanService) {
        this.loanApplicationRepository = loanApplicationRepository;
        this.userRepository = userRepository;
        this.loanApplicationAdapter = loanApplicationAdapter;
        this.loanService = loanService;
    }
    

    @PostMapping(value = "/loan/request") 
    public void requestLoan(@RequestBody final LoanRequest loanRequest){
        System.out.println(loanRequest);
        LoanApplication loanApplication = loanApplicationAdapter.transform(loanRequest);
        loanApplicationRepository.save(loanApplication);
    }

    @GetMapping(value = "/loan/requests")
    public List<LoanApplication> findAllLoanApplications(){
        return loanApplicationRepository.findAll();
    }

    @GetMapping(value = "/users") 
    public List<User> findUsers(){
        return userRepository.findAll();
    }

    @PostMapping(value = "/loan/accept/{lenderId}/{loanApplicationId}") 
    public void acceptLoan(@PathVariable final String lenderId, @PathVariable final String loanApplicationId){
        loanService.acceptLoan(Long.parseLong(loanApplicationId), Long.parseLong(lenderId));
    }
}
