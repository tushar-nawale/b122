package com.braindata.bankmanagement.client;
import com.braindata.bankmanagement.serviceImpl.*;
import com.braindata.bankmanagement.model.*;
import com.braindata.bankmanagement.service.*;
import java.util.Scanner;
public class Test {
	
	
	public static void main(String[] args)
	{
		Rbi bank=new Hdfc();

		int t=0;
		do {
			System.out.println("***************************************");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1 for create account");
		System.out.println("enter 2 for display all detail");
		System.out.println("enter 3 for deposite money");
		System.out.println("enter 4 for withdrawal");
		System.out.println("enter 5 for balance check");
		System.out.println("enter 6 for exit");
		int i=sc.nextInt();
		//Display proper msg for calling methods.
		
		//As per user choice perform bank operation using switch case
		
			
		
		switch(i)
		{
		case 1:
			bank.createAccount();
			break;
			
		case 2:
			bank.displayAllDetails();
			break;
			
		case 3:
			bank.depositeMoney();
			break;
			
		case 4:
			bank.withdrawal();
			break;
			
		case 5:
			bank.balanceCheck();
			break;
			
		case 6: 
			System.out.println("exit");
			break;
			
		default:
			
			System.out.println("wrong input");
		}
		t=i;
		}while(t<6);
    	 }

}
