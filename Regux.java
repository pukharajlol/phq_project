package com.newjava;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Other{
	public static void patten() {
		
		Scanner sc=new Scanner(System.in);
		 String arr[]=new String[4]; 
		 System.out.println("enter user name");
		 int i=0;
		 while(i<4) {
			 arr[i]=sc.nextLine();
			 i++;
		 } 
		 
		 for(String s:arr) {
			 int flag=0,flag1=0,flag2=0,flag3=0;
			 if(s.length()<10 && s.length()>5) {
				 for(int j=0;j<s.length();j++) {
					 char cm=s.charAt(j);
					 if(cm>=65 && cm<=90) {
						 flag=1;
					 }   
					 
					 if(cm>=48 && cm<=57) {
						 flag1=1;
					 }if(cm==64 || cm==35 || cm==42 || cm==61) {
						 flag2=1;
					 }
					 if(cm==32) {
						 flag3=1;
					 }
				 }
				 if(flag==1 && flag1==1 && flag2==1 && flag3==0) {
					 System.out.println("PASS");
				 }else {
					 System.out.println("FAIL");
				 }
				 
				 
				 
			 }else {
				 System.out.println("FAIL");
			 }
			 
		 }
	}
}
class Regx{
	public static void sort() {
		Scanner sc=new Scanner(System.in);
		 String arr[]=new String[4];
		 String regx="((?=.*[0-9])(?=.*[A-Z])(?=.*[@#*=])(?=[\\S]+$).{5,10})";
		 System.out.println("enter user name");
		 int i=0;
		 while(i<4) {
			 arr[i]=sc.nextLine();
			 i++;
		 }
		 Pattern p = Pattern.compile(regx); 
		 for(String s:arr) { 
			 Matcher m = p.matcher(s);  
			  if(m.matches()) {
				  System.out.println("PASS");
			  }else {
				  System.out.println("FAIL");
			  }
			
		 }

	}
}
public class Regux { 
	public static void main(String[] args) {
		  Other.patten();
		  System.out.println("***********************************************");
		  Regx.sort();
		 
	} 
}
