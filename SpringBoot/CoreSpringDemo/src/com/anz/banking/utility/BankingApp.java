package com.anz.banking.utility;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.anz.banking.entities.Branch;
import com.anz.banking.models.Customer;
import com.anz.banking.models.DebitCard;
import com.anz.banking.models.PrivilegedCustomer;
import com.anz.banking.models.Transaction;

public class BankingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Resource resource= new ClassPathResource("banking-context.xml");
		BeanFactory ctx =new XmlBeanFactory(resource);
		PrivilegedCustomer obj = (PrivilegedCustomer) ctx.getBean("pcustomer");
		System.out.println("Customer Id --->"+obj.getCustomerId());
		for (DebitCard dc : obj.getDebitCardList())
		{
			System.out.println("Debit Card No --->"+dc.getCardNo());
			System.out.println("Debit Card Limit --->"+dc.getDebitLimit());
		}
		System.out.println("Relationship Manager No ------>"+obj.getRmContactNo());
		
		ApplicationContext actx= new ClassPathXmlApplicationContext("banking-context.xml");
		Transaction obj1 = (Transaction) actx.getBean("transaction");
		System.out.println("Debit Card Number Is -->" + obj1.getDebitCard().getCardNo());
		Branch branchObj = (Branch) actx.getBean("branchInstance");
	}

}
