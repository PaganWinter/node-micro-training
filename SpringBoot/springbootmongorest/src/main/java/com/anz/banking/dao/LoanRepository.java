package com.anz.banking.dao;

import javax.transaction.Transactional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.anz.banking.models.Loan;

@Transactional
public interface LoanRepository extends MongoRepository<Loan,String>{

}
