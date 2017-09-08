package com.scope.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.scope.entities.Bank;
import com.scope.entities.Trader;
import com.scope.services.TraderService;

import org.springframework.validation.Validator;
@Controller
public class WelcomeController {
	@Autowired 
	@Qualifier("validator")
	private Validator validator;
	@Autowired
	private TraderService traderService;

	@ModelAttribute("bankList") 
	  public List<Bank> getBankList()
	  {
		  List<Bank> bankList =new ArrayList<Bank>();
			Bank bank =new Bank();
			bank.setBankId(1);
			bank.setBankName("RBS");
			bankList.add(bank);
			bank =new Bank();
			bank.setBankId(2);
			bank.setBankName("HDFC");
			bankList.add(bank);
			bank =new Bank();
			bank.setBankId(3);
			bank.setBankName("Axis");
			bankList.add(bank);
					
			return bankList;

	  }
	
	
	
	
	@RequestMapping(value="/" , method=RequestMethod.GET)
	public String printWelcome(ModelMap model) {

		model.addAttribute("message", "Banking MVC Project");
		return "index";

	}
	@RequestMapping(value="/register.htm" , method=RequestMethod.GET)
	public ModelAndView register(HttpServletRequest request, HttpServletResponse response,ModelMap map)
	{
		Trader trader = new Trader();
		map.addAttribute(trader);
		ModelAndView mv= new ModelAndView();
		mv.setViewName("register");

		return mv;
	}
	
	@RequestMapping("/traderRegister.htm")
	public ModelAndView addTrader(HttpServletRequest request, HttpServletResponse response,@ModelAttribute("trader") @Valid Trader trader,BindingResult result)
	{
		
		System.out.println(trader.getTraderName());		
		
		validator.validate(trader, result);	
		
		ModelAndView mv= new ModelAndView();
		if (result.hasErrors()) {     
			 mv.setViewName("register");			
		} 
		else
		{
		 traderService.addTraderService(trader);	
		  mv.setViewName("success");
		
		}
		
		return mv;
	}

	

}
