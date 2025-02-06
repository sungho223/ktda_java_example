package com.ktdsuniversity.edu.inheritance;

public class EmailContact extends Contact{

	private String email;
	
	public EmailContact(String name, String phone, String email) {
		super(name, phone);
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	@Override
	public void printContant() {
		super.printContant();
		System.out.println("이메일: " + this.email);
	}

	
	
	
}
