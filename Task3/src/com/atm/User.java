package com.atm;

public class User {
	private double amount =1000;
	
	public double display()
	{
		return amount;
	}
	
	public void deposit(double amount)
	{
		if(amount > 0)
		{
			this.amount += amount;
			System.out.println("Successfully deposited ₹ "+ amount+" to your account.");
		}
		else {
			System.out.println("Invalid deposit option.");
		}
	}
	
	public void withdraw(double amount)
	{
		if(amount > 0 && amount <= this.amount)
		{
			this.amount-= amount;
			System.out.println("Successfully withdrawn ₹ "+ amount + " from your account.");
		}
		else if(amount > this.amount)
		{
			System.out.println("Insufficient balance.");
		}
		else
		{
			System.out.println("Invalid withdraw option.");
		}

	}
	
	

}
