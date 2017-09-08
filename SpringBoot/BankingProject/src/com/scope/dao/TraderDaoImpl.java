package com.scope.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scope.entities.Trader;
@Repository
public class TraderDaoImpl  implements TraderDao{
@Autowired	
private SessionFactory sessionfactory;
	@Override
	public void addTraderDao(Trader trader) {
		// TODO Auto-generated method stub
		sessionfactory.getCurrentSession().saveOrUpdate(trader);
	}

}
