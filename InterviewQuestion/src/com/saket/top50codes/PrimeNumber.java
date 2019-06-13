package com.saket.top50codes;

import java.util.Scanner;

public class PrimeNumber {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("Enter the no. to be checked for prime");
		Scanner sc = new Scanner(System.in);
		int enter_no = sc.nextInt();
		
		System.out.println("The no. to be checked for prime : "+enter_no);
		
		if(enter_no==1) {
			System.out.println("Neither a prime nor a composite no.");
			return;
		}
		
		if(enter_no==2 || enter_no%2!=0 ) {
			System.out.println(enter_no+ " is a prime no.");
		}
		else {
			System.out.println("Not a prime");
		}
	}

	

}
