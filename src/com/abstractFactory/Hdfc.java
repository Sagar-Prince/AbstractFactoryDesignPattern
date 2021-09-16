package com.abstractFactory;

public class Hdfc implements Bank {
	private final String bname;
	
	public Hdfc() {
		
	bname="hdfc_bank";
	}

	@Override
	public String getBankName() {
		
		return bname;
	}

	
}
