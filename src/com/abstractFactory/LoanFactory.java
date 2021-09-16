package com.abstractFactory;

public class LoanFactory extends AbstractFactory {

	@Override
	public Bank getBank(String bank) {
		return null;
	}

	@Override
	public Loan getLoan(String Loan) {
		if (Loan == null) {
			return null;
		} else if (Loan.equalsIgnoreCase("home"))

		{
			return new HomeLoan();
		} else if (Loan.equalsIgnoreCase("Bussiness"))
			
		{
			return new BussinessLoan();
		} else if (Loan.equalsIgnoreCase("education")) 
			
		{
			return new EduationLoan();
		}

		return null;
	}

}
