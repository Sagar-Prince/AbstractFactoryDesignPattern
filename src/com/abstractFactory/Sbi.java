package com.abstractFactory;

public class Sbi implements Bank{
	private final String bname;

	public Sbi() {
		bname="Sbi_Bank";
	}
	@Override
	public String getBankName() {
		
		return bname;
	}

}
