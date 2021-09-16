package com.abstractFactory;

public abstract class Loan {

	double rate;
	abstract void getInterestRate(double rate);
	
	public void calculateLoan(double loan_amount, int year ) {
		System.out.println(loan_amount);
		System.out.println(year);
		System.out.println(rate);
	}
}
