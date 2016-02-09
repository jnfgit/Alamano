package com.beans;

public class LoginBean {

	private String emailAddress;
	private String password;
	private boolean rememberMe;
	
	public String login(){
		System.out.print(emailAddress + " " + password + " " + rememberMe);
		return null;
	}
	
		
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isRememberMe() {
		return rememberMe;
	}
	public void setRememberMe(boolean rememberMe) {
		this.rememberMe = rememberMe;
	}
}
