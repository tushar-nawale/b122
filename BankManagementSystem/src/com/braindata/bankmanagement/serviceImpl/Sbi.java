package com.braindata.bankmanagement.serviceImpl;
import com.braindata.bankmanagement.service.*;
import com.braindata.bankmanagement.model.*;
import java.util.Scanner;
public class Sbi implements Rbi{
	Account a=new Account();
	Scanner sc=new Scanner(System.in);
		int d;
		public void createAccount()
		{
			
			
			System.out.println("createAccount");
			System.out.print("enter Account no=");
			int Accno=sc.nextInt();
			
			System.out.print("enter name=");
			String name=sc.next();
			
			System.out.print("enter Mob no=");
			String mobNo=sc.next();
			
			System.out.print("enter Adhar no=");
			String adharNo=sc.next();
			
			System.out.print("enter Gender=");
			String gender=sc.next();
			
		


			a.setAccNo(Accno);
			a.setName(name);
			a.setMobNo(mobNo);
			a.setAdharNo(adharNo);
			a.setGender(gender);
			
			System.out.print("enter age=");
			int age=sc.nextInt();
			if(age>=18)
			{
			a.setAge(age);
			
			
			
			double i=0;
			do {
				
			System.out.print("enter Account balance=");
			double balance=sc.nextDouble();
			if(balance<500)
			{
				System.out.println("please enter amount greater than or equal to 500");
			}
			else if(balance>=500)
			{
				a.setBalance(balance);
				System.out.println("account create successfully");
				
			}
			i=a.getBalance();
			
			}while(i<500);
			d++;
			}
			else
			{
				System.out.println("age should be greater than or equal to 18");
			}
			
		}
		public void displayAllDetails()
		{
			
			if(d==0)
			{
				System.out.println("first creat your account");
			}
			else
			{
			System.out.println("display all details");
		
			
			System.out.println("Account no="+a.getAccNo());
			System.out.println("Name="+a.getName());
			System.out.println("Mob No="+a.getMobNo());
			System.out.println("Adhar No="+a.getAdharNo());
			System.out.println("Gender="+a.getGender());
			System.out.println("Age="+a.getAge());
			System.out.println("Balance="+a.getBalance());
			}
			
		}
		public void depositeMoney()
		{
			if(d==0)
			{
				System.out.println("first creat your account");
			}
			else
			{
			System.out.println("deposit money");
			
			System.out.println("enter amount to deposit=");
			double amount=sc.nextDouble();
			double d=amount+a.getBalance();
			a.setBalance(d);
			System.out.println("your account balance is="+a.getBalance());
			}
		}
		public void withdrawal()
		{
			if(d==0)
			{
				System.out.println("first creat your account");
			}
			else
			{
			System.out.println("withdrawal");
			double t=0;
			do
			{
			System.out.println("enter amount to withdrawal=");
			double amount=sc.nextDouble();
			double w=a.getBalance()-amount;
			
			if(w>=500)
			{
			a.setBalance(w);
			System.out.println("your account balace is="+a.getBalance());
			}
			else
			{
				System.out.println("maintain balance greater than or equal to 500");
			}
			t=w;
			}while(t<500);
			}
			
		}
		public void balanceCheck()
		{
			if(d==0)
			{
				System.out.println("first creat your account");
			}
			else
			{
			System.out.println("balance check");
			System.out.println("your account balace is="+a.getBalance());
			}
		}

	
		
}
