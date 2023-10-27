package com.newjava;

import java.util.Scanner;

class InvalidInputExecption extends SuccessTrunstionExecption{
	public InvalidInputExecption(String s) {
		 	super(s);
	}
	 
}
class InsufficientFundExecption extends SuccessTrunstionExecption{
	public InsufficientFundExecption(String s) {
		 	super(s);
	}
	 
}
class SuccessTrunstionExecption extends Exception{
	public SuccessTrunstionExecption(String s) {
		 	super(s);
	}
	
}

public class User_Defined_Execption {

	
	static void bank() throws InvalidInputExecption, InsufficientFundExecption {
		int totel=2000;
		Scanner sc=new Scanner(System.in); 
	 System.out.println("Please Enter Widerow Amount ");
	 int wid=sc.nextInt();
	 if(wid<=0) {
		 
		 throw new InvalidInputExecption("Please Enter Valid / Positive Input");
	 
		 
	 }
	 else if(wid>0 && wid<=totel) {
		 totel-=wid;
		 
		 System.out.println("Thanku for our bank successfuily transtion ");
		 System.out.println("bank blance is rem "+totel);
	 }
	 else if(wid>totel) {
		 
			 throw new InsufficientFundExecption(" Sorry ! insufficient fund in your account");
		 
	 }
	}
	public static void main(String[] args)   {
		while(true) {
			try {
				User_Defined_Execption.bank(); 
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		
	} 
}
