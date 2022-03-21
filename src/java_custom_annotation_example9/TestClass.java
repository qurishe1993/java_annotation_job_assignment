package java_custom_annotation_example9;

import java.lang.annotation.*;
/*--
 * Access the data from User-Defined 
 * Annotation in TestClass Application
 * --*/
public class TestClass {

	public static void main(String[] args) {
		Account acc=new Account("IBBL-0011","Qurishe","Student-Account");
		acc.getAccountDetails();
		System.out.println();
		
		acc.getBankDetails();
		
		/*-this is another system
		 * as a alternative system---
		 * we use getBankDetails() Method
		 * and we call here getBankDetails() Method
		 * -*/
		
		/*----
		Class c=acc.getClass();
		Annotation ann=c.getAnnotation(Bank.class);
		
		Bank b=(Bank)ann;
		System.out.println("----Bank Details----");
		System.out.println("--------------------");
		System.out.println("Bank Name   : "+b.name());
		System.out.println("Branch Name : "+b.branch());
		System.out.println("Phone       : "+b.phone());
		----*/
	}
}
