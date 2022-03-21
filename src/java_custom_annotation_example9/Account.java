package java_custom_annotation_example9;

import java.lang.reflect.*;

/*--
 * Utilize User defined Annotations in
 * java Application
 * --*/

public class Account {
	String accNo;
	String accName;
	String accType;

	public Account(String accNo, String accName, String accType) {
		this.accNo = accNo;
		this.accName = accName;
		this.accType = accType;
	}

	public void getAccountDetails() {
		System.out.println("-------Account Details-------");
		System.out.println("-----------------------------");
		System.out.println("Account Number : " + accNo);
		System.out.println("Account Name   : " + accName);
		System.out.println("Account Type   : " + accType);
		System.out.println("---End of Account Details---");
	}

	/*step-1-@Bank we can not add any value so default value is shown-*/
	/*step-2-@Bank(name="Qurishe",branch="Dhaka",phone="09897890")-*/
	/*-if we use step-2 then we will get new inserted value -*/
	
	@Bank()
	public void getBankDetails() {
		try {
			Class<? extends Account> c = this.getClass();
			Method m = c.getMethod("getBankDetails");
			Bank bn = m.getAnnotation(Bank.class);
		
			System.out.println("--------Bank Details--------");
			System.out.println("----------------------------");
			System.out.println("Bank Name     : " + bn.name());
			System.out.println("Branch Name   : " + bn.branch());
			System.out.println("Phone         : " + bn.phone());

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
