package com.homecredit.openapi.api.mapper;

import com.homecredit.openapi.api.dto.AccAccountsDto;
import com.homecredit.openapi.api.model.AccAccounts;

public class AccAccountsMapper {
	
	public AccAccounts changeDtotoModel (AccAccountsDto input, AccAccounts result){
		
		result.setBank(input.getBank());
		result.setAccountNumber(input.getAccountNumber());
		result.setAccountType(input.getAccountType());
		result.setChannel(input.getChannel());
		result.setValidFrom(input.getValidFrom());
		result.setValidTo(input.getValidTo());
		result.setFee(input.getFee());
		result.setWd(input.getWd());
		result.setPaymentWeekdays(input.getPaymentWeekdays());
		return result;
	}
	
	public AccAccountsDto changeModeltoDto (AccAccounts input, AccAccountsDto result){
		
		result.setBank(input.getBank());
		result.setAccountNumber(input.getAccountNumber());
		result.setAccountType(input.getAccountType());
		result.setChannel(input.getChannel());
		result.setValidFrom(input.getValidFrom());
		result.setValidTo(input.getValidTo());
		result.setFee(input.getFee());
		result.setWd(input.getWd());
		result.setPaymentWeekdays(input.getPaymentWeekdays());
		return result;
	}

}
