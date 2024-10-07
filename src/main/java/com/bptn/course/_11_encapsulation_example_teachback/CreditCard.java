package com.bptn.course._11_encapsulation_example_teachback;


public class CreditCard {
	
	private int cardNumber;
	private int pin;
	private String cardHolder;
	private int cvc;
	
	public int getCardNumber() {
		return cardNumber;
	}
	
	public int getPin() {
		return pin;
	}
	
	public String getCardHolder() {
		return cardHolder;
	}
	
	public int getCvc() { 
		return cvc;
	}
	
	public void setCardNumber(int number) {
		cardNumber = number;
	}
	
	public void setPin(int p) {
		pin = p;
	}
	
	public void setCardHolder(String holder) {
		cardHolder = holder;
	}
	
	public void setCvc(int c) {
		cvc= c;
	}
	

	public static void main(String[] args) {
		
		CreditCard obj = new CreditCard();
		System.out.println(obj.cardNumber);

	}

}
