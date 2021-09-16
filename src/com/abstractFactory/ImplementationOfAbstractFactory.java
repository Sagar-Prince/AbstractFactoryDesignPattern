
package com.abstractFactory;

import java.util.Scanner;

public class ImplementationOfAbstractFactory {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("choose either for (bank) or for (Lone)");
		String choose = sc.next();

		if (choose.equals("bank")) {
			System.out.println("enter bank name");
			String bankName=sc.next();
			
			AbstractFactory factory2 = FactoryCreator.getFactory(choose);
			Bank bank1 = factory2.getBank(bankName);
			System.out.println(bank1.getBankName()); 
			

		} else {
			System.out.println("Enter the type of Loan");
			String loanName = sc.next();
			System.out.println("enter the rate of interest");
			double interest = sc.nextDouble();
			System.out.println("enter the loan amount");
			double amount = sc.nextDouble();
			System.out.println("Enter the number of year");
			int year = sc.nextInt();

			AbstractFactory factory = FactoryCreator.getFactory(choose);
			Loan loan = factory.getLoan(loanName);
			loan.getInterestRate(interest);
			loan.calculateLoan(amount, year);

		}

		
	}

}
