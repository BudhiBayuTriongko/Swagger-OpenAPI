package com.homecredit.openapi.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.homecredit.openapi.api.model.AccAccounts;

public interface GeneralAccAccountsDao extends JpaRepository<AccAccounts, String>,
QueryDslPredicateExecutor<AccAccounts>{

}
