package org.controlStatements;

import java.util.Scanner;

public class ScannerInput {
	static final String  password="pppp";
	
	public static void all() {

		ScannerInput.menuCard();
	
		System.out.println("Press 1 for Factorial Calculation ");
		System.out.println("Press 2 for Fibonacci Sequence");
		System.out.println("Press 3 for Prime Number Check");
		System.out.println("Press 4 for Sum of Digits");
		System.out.println("Press 5 for Reverse Number");
		
		int num=s.nextInt();
		
		switch(num) {
		
		case 1:
		
			System.out.println("Enter number for Factorial Calculation ");
			
			int factorial=s.nextInt();
			
			int fact=1;
			for(int b=1;b<=factorial;b++) {
				
				fact=fact*b;
				
				System.out.println("The Factorial of>>"+factorial+"is>>"+ fact);
			}	
			
			break;
			
		case 2:
			System.out.println("Enter first number for Fibonacci Sequence");
			
			int f1=s.nextInt();
			
            System.out.println("Enter second number for Fibonacci Sequence");
			
			int f2=s.nextInt();
			
			System.out.println("Enter Number of position for Fibonacci Sequence");
			int f3=s.nextInt();
			
			for(int c=1;c<=f3;c++) {
				
				System.out.println(f1);
				
				int f4=f1+f2;
				    f1=f2;
					f2=f4;		
			}
		
			break;
			
		case 3:
			
			System.out.println("Enter  number to check prime or not");
			int count=0; 
			int number=s.nextInt();
			
			for(int a=1;a<=number;a++) {
				
				if(number%a==0) {
					
					count++;
							}	
			}
			
			if(count==2) {System.out.println("The Number is Prime Number");
		
			}else {
				System.out.println("The Number is Non Prime Number");
			}
		
			break;
			
		case 4:
			
			System.out.println("Sum of Digits");
			System.out.println("Enter first number to add");
			int first=s.nextInt();
			System.out.println("Enter second number");
			int second=s.nextInt();
			int sum=first+second;
			System.out.println("The sum of two numbers is>>>"+sum);
		
			break;
			
		case 5:
			
			System.out.println("Enter any number to get Reverse Number");
			
			int rev=s.nextInt();
			int a=0;
			
			while(rev>0) {
				
				a=a*10;
				a=a+rev%10;
				rev=rev/10;
				
			}
			System.out.println("The reverse number is>>>"+a);
			
			break;
			
			default:
				
				System.out.println("Invalid Input");
		
		}
	}

	public static void menuCard() {
		System.out.println("Menu Card");
		System.out.println("Factorial Calculation");
		System.out.println("Fibonacci Sequence");
		System.out.println("Prime Number Check");
		System.out.println("Sum of Digits");
		System.out.println("Reverse Number");
	}
	
	static Scanner s=new Scanner(System.in); 
	
	public static void login() {
		
	boolean attempt=false;
		
		int i = 0;
		while( i < 3) {
			System.out.println("Please enter your password");
			
			String pass=s.next();
		
		if(pass.equalsIgnoreCase(password)) {
			System.out.println("Login successful");
			ScannerInput.all();
			//attempt=true;
		}else {
			
			i++;
			System.out.println("Incorrect Password>>"+i+"st attempt");
		}
			
		}
		
		if(!attempt ) {
			System.out.println("To much attempts>>>Access denied>>Please try after some time");
		}
		
	}
		
	public static void main(String[] args) {
		
		ScannerInput.login();
		

}
}