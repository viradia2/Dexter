package com.creditscore;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserAccount {
	
	/*
	 *  name, phone number, ssn, 
	 *  account number, address, dob,
	 *  email address, citizenship, 
	 *  balance, credit score.
	 */
	
	private String name;
	private long phoneNumber;
	private int ssn;
	private int accountNumber;
	private String address;
	private String dob;
	private String emailId;
	private String citizenship;
	private int balance;
	private int creditScore;
	
	
//	public UserAccount(String name, long phoneNumber, int ssn, int accountNumber, 
//			String address, String dob, String emailId, String citizenship, 
//			int balance, int creditScore) {
//		this.name = name;
//		this.phoneNumber = phoneNumber;
//		this.ssn = ssn;
//		this.accountNumber = accountNumber;
//		this.address = address;
//		this.dob = dob;
//		this.emailId = emailId;
//		this.citizenship = citizenship;
//		this.balance = balance;
//		this.creditScore = creditScore;
//	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public String getCitizenship() {
		return citizenship;
	}
	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int getCreditScore() {
		return creditScore;
	}
	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}
}
