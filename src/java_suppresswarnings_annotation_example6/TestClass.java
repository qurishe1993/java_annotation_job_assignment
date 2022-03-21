package java_suppresswarnings_annotation_example6;

import java.util.*;

class Bank {
	@SuppressWarnings("unchecked")
	public ArrayList listCustomer() {
		ArrayList al = new ArrayList();
		al.add("Wornoz");
		al.add("Qurishe");
		al.add(1993);
		return al;
	}
}

public class TestClass {

	public static void main(String[] args) {
		Bank b = new Bank();
		List l = b.listCustomer();
		System.out.println(l);
	}
}
