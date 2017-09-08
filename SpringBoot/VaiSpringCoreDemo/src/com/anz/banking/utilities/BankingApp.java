package com.anz.banking.utilities;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.anz.banking.models.DataSource;
import com.anz.banking.models.JPADataSource;
import com.anz.banking.models.SessionFactory;

public class BankingApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* If not using Autowired */
		// Resource resource = new ClassPathResource("db-context.xml");
		// BeanFactory beanFact = new XmlBeanFactory(resource);
		// DataSource datasource = (DataSource) beanFact.getBean("dsBean");
		// SessionFactory sessionfactory = (SessionFactory) beanFact.getBean("sfBean");
		// JPADataSource jpaDatasource = (JPADataSource) beanFact.getBean("jpadsBean");

		/* If using Autowired Annotation */
		ApplicationContext actx = new ClassPathXmlApplicationContext("db-context.xml");

		DataSource datasource = (DataSource) actx.getBean("dsBean");
		System.out.println("datasource: " + datasource.toString());
		System.out.println("UserName: " + datasource.getUserName());
		System.out.println("DbName: " + datasource.getDbName());

		SessionFactory sessionfactory = (SessionFactory) actx.getBean("sfBean");
		System.out.println("sessionfactory: " + sessionfactory.toString());
		System.out.println("Duration: " + sessionfactory.getDuration());
		System.out.println("DataSource: " + sessionfactory.getDataSource());
		System.out.println("DataSource.url: " + sessionfactory.getDataSource().getUrl());
		System.out.println("DataSource.UserName: " + sessionfactory.getDataSource().getUserName());
		System.out.println("DataSource.DbName: " + sessionfactory.getDataSource().getDbName());
		System.out.println("DataSource.getConnectionPoolSize: " + ((JPADataSource) sessionfactory.getDataSource()).getConnectionPoolSize());

		JPADataSource jpaDatasource = (JPADataSource) actx.getBean("jpadsBean");
		System.out.println("jpaDatasource: " + jpaDatasource.toString());
		System.out.println("UserName: " + jpaDatasource.getUserName());
		System.out.println("DbName: " + jpaDatasource.getDbName());
		System.out.println("ConnectionPoolSize: " + jpaDatasource.getConnectionPoolSize());
	}
}


