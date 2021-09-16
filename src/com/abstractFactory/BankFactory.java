package com.abstractFactory;

public class BankFactory extends AbstractFactory{

	@Override
	public Bank getBank(String bank) {
		if(bank==null) {
			return null;
		}
		else if(bank.equalsIgnoreCase("hdfc")) {
		return new Hdfc(); 
		}
		else if(bank.equalsIgnoreCase("sbi")) {
			return new Sbi();
		}
		else if (bank.equalsIgnoreCase("icici")) {
			return new Icici();
		}
	return null;
	}

	@Override
	public Loan getLoan(String Loan) {
		
		return null;
	}
	
}
