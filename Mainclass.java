package com.atmproject;
import java.util.*;

public class Mainclass {

	public static void main(String[] args) {
		AtmoperationInterf op = new AtmIMPL();
		int atmnum = 67890;
		int atmpin = 456;
		System.out.println("Welcome to ATM");
		Scanner n = new Scanner(System.in);
		System.out.println("Enter the atm number : ");
		int atmnumber = n.nextInt();
		System.out.println("Enter atm pin : ");
		int Pin = n.nextInt();
		if((atmnum == atmnumber)&&(atmpin == Pin))
		{
			while(true) {
				System.out.println("1.View Balance\n 2.Withdraw Amount\n 3.Deposit Amount\n 4.Transfer Amount\n 5.Show Transanction History\n 6.Quit");
				System.out.println("Enter choice : ");
				int ch = n.nextInt();
				if(ch==1) {
			     op.viewBalance();
				}
				else if(ch==2) {
					System.out.println("Enter withdrawal amount :");
					double withdrawAmount = n.nextDouble();
					op.withdrawAmount(withdrawAmount); //call method withdrawAmount , pass amount which user want to withdraw
				}
				else if(ch==3) {
					System.out.println("Enter Amount to Deposit :");
					double depositAmount = n.nextDouble();
					op.depositAmount(depositAmount); //call method depositAmount, pass amount which we need to deposit
				
				}
				else if(ch==4) {
					System.out.println("Enter receipient name :");
					String receipent = n.next();
					System.out.println("Enter amount to transfer:");
					double amount  = n.nextDouble();
					op.transferAmount(amount,receipent);// call method from transferamount which is in interface and pass amount to transfer
					
					
				}
				else if(ch==5) {
					op.viewMiniStatement();
				}
				else if(ch==6) {
					System.out.println("Collect your ATM card. Thank you for using ATM machine");
					System.exit(0);
				}
				else {
					System.out.println("Please enter correct choice");
				}
			}
		}
	   else 
		 {
			System.out.println("Incorrect ATM number or Pin. Please enter correct ATM number or pin");
			System.exit(0);
		}
	}
	}


