package com.abstractFactory;

public class HomeLoan extends Loan {

	
	@Override
	void getInterestRate(double rate) {
		this.rate=rate;
	}

}
