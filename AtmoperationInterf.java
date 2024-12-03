package com.atmproject;

public interface AtmoperationInterf {
	public void viewBalance();
	public void withdrawAmount(double withdrawAmount);
	public void depositAmount(double depositAmount);
	public void viewMiniStatement();
	public void transferAmount(double amount,String receipent);

}
