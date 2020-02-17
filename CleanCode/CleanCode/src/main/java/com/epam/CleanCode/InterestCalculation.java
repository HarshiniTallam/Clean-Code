package com.epam.CleanCode;

import java.util.*;

public class InterestCalculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("--------CALCULATION OF SIMPLE & COMPOUND INTEREST----------");
		System.out.println("Enter principle Value:");
		int principle = sc.nextInt();
		System.out.println("Enter Daily Interest Rate:");
		float rate = sc.nextFloat();
		System.out.println("Enter number of days between payments:");
		int days = sc.nextInt();
		Calculation obj = new Calculation(principle, rate, days);
		System.out.println("Simple Interest is:"+obj.simpleInterest());
	    System.out.println("Compound Interest is:"+obj.compoundInterest());
	}

}
