package com.scope.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.scope.dao.TraderDao;
import com.scope.entities.Trader;
@Service
@Transactional
public class TraderServiceImpl  implements TraderService{
   @Autowired
	private TraderDao traderDao;
	@Override
	public void addTraderService(Trader trader) {
		// TODO Auto-generated method stub
		traderDao.addTraderDao(trader);
	}

}
