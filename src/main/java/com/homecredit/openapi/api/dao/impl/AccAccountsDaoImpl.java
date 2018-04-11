package com.homecredit.openapi.api.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.homecredit.openapi.api.dao.AccAccountsDao;
import com.homecredit.openapi.api.model.AccAccounts;

@Repository
public class AccAccountsDaoImpl implements AccAccountsDao{

	@PersistenceContext
	private EntityManager em;

	@Transactional
	public void save(AccAccounts accAccounts)throws Exception{
		
		try {
			em.persist(accAccounts);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	
	@Transactional
	public void saveOrUpdate(AccAccounts accAccounts)throws Exception{
		
		try {
			em.merge(accAccounts);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
}
