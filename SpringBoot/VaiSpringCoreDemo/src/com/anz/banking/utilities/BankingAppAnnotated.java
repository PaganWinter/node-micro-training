package com.anz.banking.utilities;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.anz.banking.models.DataSource;
//import com.anz.banking.models.JPADataSource;
import com.anz.banking.models.SessionFactory;

public class BankingAppAnnotated {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* If using Autowired Annotation */
		ApplicationContext actx = new ClassPathXmlApplicationContext("db-context-annotated.xml");

		SessionFactory sessionfactory = (SessionFactory) actx.getBean("sfComp");
		System.out.println("sessionfactory: " + sessionfactory.toString());
		System.out.println("Duration: " + sessionfactory.getDuration());
		System.out.println("DataSource: " + sessionfactory.getDataSource());
		System.out.println("DataSource.url: " + sessionfactory.getDataSource().getUrl());
		System.out.println("DataSource.UserName: " + sessionfactory.getDataSource().getUserName());
		System.out.println("DataSource.DbName: " + sessionfactory.getDataSource().getDbName());
	}
}


