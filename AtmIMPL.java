package com.atmproject;

import java.util.HashMap;
import java.util.Map;

public class AtmIMPL implements AtmoperationInterf{
    ATM at = new ATM();
    Map<Double,String> ministat = new HashMap<>();
	@Override
	public void viewBalance() {
		System.out.println("Available Balance is : "+at.getBalance());
		
	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		if(withdrawAmount<= at.getBalance()) {
			ministat.put(withdrawAmount, " Amount Withdrawn");
		System.out.println("Collect the cash "+withdrawAmount);
		at.setBalance(at.getBalance()-withdrawAmount);
		viewBalance();
		}
		else {
			System.out.println("Insufficient Balance !!");
		}
		
	}

	@Override
	public void depositAmount(double depositAmount) {
		ministat.put(depositAmount, " Amount Deposited");
		System.out.println(depositAmount+ " Deposited Successfully !!");
		at.setBalance(at.getBalance()+depositAmount);
		viewBalance();
		
	}
	
	@Override
	public void viewMiniStatement() {
		for(Map.Entry<Double,String> m:ministat.entrySet()) {
			System.out.println(m.getKey()+m.getValue());
		}
		
	}

	@Override
	public void transferAmount(double amount,String receipent) {
		try {
		if(at.getBalance()>=amount) {
			if(amount<=10000f) {
		    at.setBalance(at.getBalance()-amount);
			System.out.println("Successfully transferred to " +receipent );
		    String str = amount + "Rs transferred to"+ receipent+"\n";
		    System.out.println(str);
		    ministat.put(amount, " Amount Transferred");
		    }
			else {
				System.out.println("\n Sorry. The limit is 10000.");
			       }
		}
	   else {
				System.out.println("Insufficient Balance");
				
	         }
		}catch(Exception e) {
			
		}
	}
}

	
