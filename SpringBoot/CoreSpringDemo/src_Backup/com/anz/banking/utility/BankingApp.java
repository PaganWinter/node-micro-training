package com.anz.banking.utility;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.anz.banking.models.Customer;
import com.anz.banking.models.DebitCard;

public class BankingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resource resource = new ClassPathResource("banking-context.xml");
		BeanFactory ctx = new XmlBeanFactory(resource);
		Customer obj = (Customer) ctx.getBean("customer");
		System.out.println(obj.getName());
		for(DebitCard dc : obj.getDebitCardList())
		{
			System.out.println("Debit Card No is " + dc.getCardNo());
			System.out.println("Debit Limit " + dc.getDebitLimit());
		}
		System.out.println(obj.getEmail());
	}

}
