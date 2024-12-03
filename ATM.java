package com.atmproject;

public class ATM {
	private double balance;
	private double depositAmoount;
	private double withdrawAmount;
	
	
	
	//default constructor
	public ATM() {
		
		
	}
	
	
	//getter and setter
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getDepositAmoount() {
		return depositAmoount;
	}
	public void setDepositAmoount(double depositAmoount) {
		this.depositAmoount = depositAmoount;
	}
	public double getWithdrawAmount() {
		return withdrawAmount;
	}
	public void setWithdrawAmount(double withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}

}
