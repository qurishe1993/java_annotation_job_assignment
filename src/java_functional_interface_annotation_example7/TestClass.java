package java_functional_interface_annotation_example7;

@FunctionalInterface
interface Loan {
	void getLoan();
}

class GoldLoan implements Loan {
	public void getLoan() {
		System.out.println("GoldLoan");
	}
}

public class TestClass {

	public static void main(String[] args) {
		Loan l = new GoldLoan();
		l.getLoan();
	}
}
