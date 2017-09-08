package com.anz.banking.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.anz.banking.dao.LoanRepository;
import com.anz.banking.dao.LoanSearch;
import com.anz.banking.models.Loan;

@Controller
public class LoanController {
	
	@Autowired
	private LoanRepository loanRepository;
	
	@Autowired
	private LoanSearch loanSearch;
	
	@RequestMapping("/home")
	public String getAllLoans(Model model){
		
		model.addAttribute("loanList", loanRepository.findAll());
		return "home";
	}
	@RequestMapping(value="/addLoan", method=RequestMethod.POST)
	public String addLoan(@ModelAttribute Loan loan){
		loanRepository.save(loan);
		return "redirect:home";
	}
	@RequestMapping(value="/search")
	public String searchLoan(Model model, @RequestParam String search){
		model.addAttribute("loanList", loanSearch.getLoanByQuery(search));
		return "home";
	}
	
	
}
