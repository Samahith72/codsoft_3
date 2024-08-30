package com.atm;
import java.util.Scanner;

public class Atm extends User{
	
	
	private Scanner s = new Scanner(System.in);
	
	public void start() {
		System.out.println("Welcome..........");
		boolean run = true;
		while(run)
		{
			menu();
			int choice = s.nextInt();
			switch(choice)
			{
			case 1 :
				checkbalance();
				break;
			
			case 2 :
				depositinfo();
				break;
				
			case 3 :
				withdrawinfo();
				break;
				
			case 4:
				System.out.println("Thank you......");
				run = false;
				break;
			
			default :
				System.out.println("Incorrect option. Please choose valid option.");
				break;
			}
			
		
		}	
	}
	private void menu()
	{
		System.out.println("Press '1' to check balance.");
		System.out.println("Press '2' to deposit money.");
		System.out.println("Press '3' to withdraw money.");
		System.out.println("Press '4' to Exit.");
	}
	
	private void checkbalance()
	{
		System.out.println("The balance is : "+ display());
	}
	
	private void depositinfo()
	{
		System.out.println("Enter the amount you want to deposit.");
		double amt = s.nextDouble();
		deposit(amt);
	}
	
	private void withdrawinfo()
	{
		System.out.println("Enter the amount you want to withdraw.");
		double amt = s.nextDouble();
		withdraw(amt);
	}
		

}
