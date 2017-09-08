package com.anz.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anz.dao.CustomerDao;
import com.anz.models.Customer;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
   @Autowired
	private CustomerDao customerDao;
	@Override
	public void addCustomerData(Customer customer) {
		// TODO Auto-generated method stub
		customerDao.addCustomer(customer);
	}
	

}
