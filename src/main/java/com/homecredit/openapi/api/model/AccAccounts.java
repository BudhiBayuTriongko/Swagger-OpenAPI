package com.homecredit.openapi.api.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name="ACC_ACCOUNTS", schema="APP_ACCOUNT")
public class AccAccounts {
	
	@ApiModelProperty(notes = "Acc Accounts Bank Name, Is Primary key")
	@Id
	@Column (name = "BANK", nullable=false, length=30 )
	private String bank;
	@ApiModelProperty(notes = "Acc Accounts Account Number Column")
	@Column (name = "ACCOUNT_NUMBER", nullable=false, length=30 )
	private String accountNumber;
	@ApiModelProperty(notes = "Acc Accounts Account Type Column")
	@Column (name = "ACCOUNT_TYPE", nullable=false, length=10 )
	private String accountType;
	@ApiModelProperty(notes = "Acc Accounts Channel Column")
	@Column (name = "CHANNEL", nullable=false, length=50 )
	private String channel;
	@ApiModelProperty(notes = "Acc Accounts Valid From Column")
	@Column (name = "VALID_FROM", nullable=false )
	private Date validFrom;
	@ApiModelProperty(notes = "Acc Accounts Valid To Column")
	@Column (name = "VALID_TO", nullable=false)
	private Date validTo;
	@ApiModelProperty(notes = "Acc Accounts Fee Column")
	@Column (name = "FEE", nullable=false )
	private Integer fee;
	@ApiModelProperty(notes = "Acc Accounts WD Column")
	@Column (name = "WD", nullable=true, length=1)
	private String wd;
	@ApiModelProperty(notes = "Acc Accounts Payment Weekdays Column")
	@Column (name = "PAYMENT_WEEKDAYS", nullable=true, length=30 )
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
