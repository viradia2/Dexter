package com.creditscore;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bank {
	private Map<Integer, UserAccount> map = new HashMap<>();
	
	public static void main(String[] args) {
		
		Bank b = new Bank();
		
		//Adding Users
		UserAccount u = new UserAccount();
		u.setName("Vivek Viradia");
		u.setSsn(123456);
		u.setPhoneNumber(4252291231l);
		u.setEmailId("vivek@gmail.com");
		u.setDob("02-02-1993");
		u.setCreditScore(0);
		u.setCitizenship("India");
		u.setBalance(10500);
		u.setAddress("Leesburg, VA");
		u.setAccountNumber(159357);
		
		b.addUserAccount(u);
		
		UserAccount u1 = new UserAccount();
		u1.setName("Naimish Viradia");
		u1.setSsn(123457);
		u1.setPhoneNumber(4252291232l);
		u1.setEmailId("naimish@gmail.com");
		u1.setDob("02-03-1993");
		u1.setCreditScore(0);
		u1.setCitizenship("India");
		u1.setBalance(10000);
		u1.setAddress("Sanford, FL");
		u1.setAccountNumber(951753);
		
		b.addUserAccount(u1);
		
		UserAccount u2 = new UserAccount();
		u2.setName("Minal Viradia");
		u2.setSsn(123458);
		u2.setPhoneNumber(4252291131l);
		u2.setEmailId("minal@gmail.com");
		u2.setDob("02-05-1991");
		u2.setCreditScore(0);
		u2.setCitizenship("India");
		u2.setBalance(7800);
		u2.setAddress("Sanford, FL");
		u2.setAccountNumber(852654);
		
		b.addUserAccount(u2);
		
		UserAccount u3 = new UserAccount();
		u3.setName("Divyesh Thummar");
		u3.setSsn(123459);
		u3.setPhoneNumber(4252292232l);
		u3.setEmailId("divyesh@gmail.com");
		u3.setDob("02-04-1995");
		u3.setCreditScore(0);
		u3.setCitizenship("India");
		u3.setBalance(6300);
		u3.setAddress("Rajkot, GJ");
		u3.setAccountNumber(258456);
		
		b.addUserAccount(u3);
		
		UserAccount u4 = new UserAccount();
		u4.setName("Aarti Thummar");
		u4.setSsn(123429);
		u4.setPhoneNumber(4252282232l);
		u4.setEmailId("aarti@gmail.com");
		u4.setDob("01-01-1995");
		u4.setCreditScore(0);
		u4.setCitizenship("India");
		u4.setBalance(10100);
		u4.setAddress("Rajkot, GJ");
		u4.setAccountNumber(147963);
		
		b.addUserAccount(u4);
		
		//Printing Users Details Like Name and SSN
		b.printUserAccountDetails();
		//Setting Credit Score according to their Balance
		b.setCreditCardScore();
		//Printing Users Details Like Name and SSN
		b.printUserAccountDetails();
		
		Scanner s = new Scanner(System.in);
		System.out.println("Are you want to pay before applying for 2nd credit card: ");
		String ans = s.nextLine();
		/*******************************************************************
		 * Asking User if he/she wants to pay before applying for 2nd credit
		 * card. If Yes then we will set credit score again after payment
		 * and check eligibility for getting 2nd credit card.
		 *******************************************************************/
		if(ans.equalsIgnoreCase("Yes")){
			b.checkIfUserisEligibleAfterPaying();
		}
		
		System.out.println("Apply for 2nd credit card: ");
		String answer = s.nextLine();
		/********************************************************************
		 * If user wants to apply directly for 2nd credit card without paying
		 * then he/she will be asked to fill out some required details and
		 * according those details, program decides that user is eligible for 
		 * 2nd credit card or not.
		 *********************************************************************/
		if(answer.equalsIgnoreCase("Yes")){
			b.fillOutRequiredDetails();
		}
	}
	
	//Checking Users eligibility for 2nd credit card after paying some amount
	private void checkIfUserisEligibleAfterPaying() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter SSN: ");
		int ssn = sc.nextInt();
		for(Map.Entry<Integer, UserAccount> entry : map.entrySet()){
			UserAccount user = entry.getValue();
			if(ssn == entry.getKey()){
				System.out.println("Enter amount: ");
				int amount = sc.nextInt(); 
				int bal = user.getBalance();
				user.setBalance(bal - amount);
				map.put(user.getSsn(), user);
			}
		}
		setCreditCardScore();
		printUserAccountDetails();
	}
	
	/*****************************************************************
	 * Asking Name and SSN to get the data or history of User to check
	 * if user is eligible for 2nd credit card or not.
	 ******************************************************************/
	private void fillOutRequiredDetails() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Name: ");
		String name = s.nextLine();
		System.out.println("Enter SSN: ");
		int ssn = s.nextInt();
		//Checking credit card approval according to User's Credit Score history
		checkCreditCardApprovedOrNot(ssn);
	}
	
	//Checking credit card approval according to User's Credit Score history
	public void checkCreditCardApprovedOrNot(int ssn){
		for(Map.Entry<Integer, UserAccount> entry : map.entrySet()){
			UserAccount user = entry.getValue();
			if(ssn == entry.getKey()){
				int creditScore = user.getCreditScore();
				if(creditScore == 750)
					System.out.println("You are approved the limit of $10000");
				else if(creditScore == 700)
					System.out.println("You are approved the limit of $7500");
				else if(creditScore == 650)
					System.out.println("You are approved the limit of $5000");
				else if(creditScore == 600)
					System.out.println("You are approved the limit of $2500");
				else
					System.out.println("Request Declined");
			}
		}
	}
	
	//Generating Credit Score according to User's Previous Card Balance
	private void setCreditCardScore() {
		// TODO Auto-generated method stub
		for(Map.Entry<Integer, UserAccount> entry : map.entrySet()){
			UserAccount user  = entry.getValue();
			if(user.getBalance() >= 10000)
				user.setCreditScore(500);
			else if(user.getBalance() > 7500 && user.getBalance() < 10000)
				user.setCreditScore(600);
			else if(user.getBalance() > 5000 && user.getBalance() <= 7500)
				user.setCreditScore(650);
			else if(user.getBalance() > 2500 && user.getBalance() <= 5000)
				user.setCreditScore(700);
			else if(user.getBalance() <= 2500)
				user.setCreditScore(750);
			
			map.put(user.getSsn(), user);
		}
	}
	
	//Printing User's details
	private void printUserAccountDetails() {
		// TODO Auto-generated method stub
		for(Map.Entry<Integer, UserAccount> entry : map.entrySet()){
			UserAccount user  = entry.getValue();
			System.out.println("User Details: ");
			System.out.println(user.getSsn() + " " + user.getName() + " " + user.getCreditScore());
		}
	}
	
	//Adding User Account Details to Map
	public void addUserAccount(UserAccount user){
		map.put(user.getSsn(), user);
	}
	

}
