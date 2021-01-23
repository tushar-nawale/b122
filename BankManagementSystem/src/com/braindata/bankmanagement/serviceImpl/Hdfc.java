package com.braindata.bankmanagement.serviceImpl;
import java.util.Scanner;

import com.braindata.bankmanagement.model.*;
import com.braindata.bankmanagement.service.*;

public class Hdfc implements Rbi{
	Account h=new Account();
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
			
			h.setAccNo(Accno);
			h.setName(name);
			h.setMobNo(mobNo);
			h.setAdharNo(adharNo);
			h.setGender(gender);

			System.out.print("enter age=");
			int age=sc.nextInt();
			if(age>=21)
			{
			h.setAge(age);
				double i=0;
				while(i<2000)
				{
					System.out.print("enter Account balance=");
					double balance=sc.nextDouble();
						if(balance<2000)
						{
							System.out.println("please enter amount greater than or equal to 2000");
						}
						else if(balance>=2000)
						{
							h.setBalance(balance);
							System.out.println("account create successfully");	
						}
					i=balance;
				}
			d++;
			}
			else
			{
				System.out.println("age should be greater than or equal to 21");
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
		
			
				System.out.println("Account no="+h.getAccNo());
				System.out.println("Name="+h.getName());
				System.out.println("Mob No="+h.getMobNo());
				System.out.println("Adhar No="+h.getAdharNo());
				System.out.println("Gender="+h.getGender());
				System.out.println("Age="+h.getAge());
				System.out.println("Balance="+h.getBalance());
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
				double d=amount+h.getBalance();
				h.setBalance(d);
				System.out.println("your account balance is="+h.getBalance());
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
				while(t<2000)
				{
					System.out.println("enter amount to withdrawal=");
					double amount=sc.nextDouble();
					double w=h.getBalance()-amount;
			
					if(w>=2000)
					{
						h.setBalance(w);
						System.out.println("your account balace is="+h.getBalance());
					}
					else
					{
						System.out.println("maintain balance greater than or equal to 2000");
					}
					
					t=w;
				}
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
				System.out.println("your account balace is="+h.getBalance());
			}
		}

}
