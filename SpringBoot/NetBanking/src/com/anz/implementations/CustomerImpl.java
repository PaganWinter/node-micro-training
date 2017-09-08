package com.anz.implementations;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.anz.dao.CustomerDao;
import com.anz.models.Customer;


@Repository
public class CustomerImpl  implements CustomerDao{
   @Autowired
	private SessionFactory sessionFactory;
	@Override
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(customer);
	}
	

}
