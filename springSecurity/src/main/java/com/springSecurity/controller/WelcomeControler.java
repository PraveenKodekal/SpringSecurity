package com.springSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeControler {
	
	@GetMapping("/")
	public String welcomeMessage(String msg) {
		msg="HI this is Spring Security Banking  Application";
		return msg;
	}

	
	@GetMapping("/account")
	public int acNumber(int acNumber) {
		acNumber = 543687624;
		return acNumber;
	}
	
	
	@GetMapping("/balance")
	public Double acBalance(Double bal) {
		
		bal=9876.76;
		return bal;
	}
	
	
	@GetMapping("/loan")
	public String loanAmount(Double loan, String msg) {
		loan=200000.0;
		msg="Loan taken : "+ loan;
		return msg;
	}
	
	
	@GetMapping("/emi")
	public String emiDetails(String msg, Double emi) {
		emi=1232.22;
		msg="Your loan EMI due amount will be : "+ emi;
		return msg;
	}
	
	@GetMapping("/thankYou")
	public String supportContact(String message) {
		message="We are pleased to assist you, Thank you for contacting the customer care ";
		return message;
	}
}
