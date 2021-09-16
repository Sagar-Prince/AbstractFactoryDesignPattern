package com.abstractFactory;

public class Icici implements Bank {
	private final String bname;
	public Icici() {
		// TODO Auto-generated constructor stub
		bname="Icici_Bank";
	}
	@Override
	public String getBankName() {
		
		return bname;
	}

	
}
