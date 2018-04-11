package com.homecredit.openapi.api.dto;

import java.util.Date;

public class AccAccountsDto {
	
	private String bank;
	private String accountNumber;
	private String accountType;
	private String channel;
	private Date validFrom;
	private Date validTo;
	private Integer fee;
	private String wd;
	private String paymentWeekdays;
	
	
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public Date getValidFrom() {
		return validFrom;
	}
	public void setValidFrom(Date validFrom) {
		this.validFrom = validFrom;
	}
	public Date getValidTo() {
		return validTo;
	}
	public void setValidTo(Date validTo) {
		this.validTo = validTo;
	}
	public Integer getFee() {
		return fee;
	}
	public void setFee(Integer fee) {
		this.fee = fee;
	}
	public String getWd() {
		return wd;
	}
	public void setWd(String wd) {
		this.wd = wd;
	}
	public String getPaymentWeekdays() {
		return paymentWeekdays;
	}
	public void setPaymentWeekdays(String paymentWeekdays) {
		this.paymentWeekdays = paymentWeekdays;
	}
	@Override
	public String toString() {
		return "AccAccounts [bank=" + bank + ", accountNumber=" + accountNumber + ", accountType=" + accountType
				+ ", channel=" + channel + ", validFrom=" + validFrom + ", validTo=" + validTo + ", fee=" + fee
				+ ", wd=" + wd + ", paymentWeekdays=" + paymentWeekdays + "]";
	}
	
	

}
