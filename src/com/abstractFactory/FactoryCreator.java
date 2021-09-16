package com.abstractFactory;

public class FactoryCreator {
	
	public static AbstractFactory getFactory(String choice)
	{
		if(choice.equalsIgnoreCase("bank")) 
		{
			return new BankFactory();
		}
		if(choice.equalsIgnoreCase("Loan"))
		{
			return new LoanFactory();
			}
		return null;
	}

}
