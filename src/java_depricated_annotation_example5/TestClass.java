package java_depricated_annotation_example5;

class Employee {
	@Deprecated
	public void gen_Salary(int basic, double hq) {
		double total = basic + hq;
		System.out.println("Salary is claculated , basic amount and hq:" + total);
	}

	public void update_gen_salary(int basic, double hq, int ta, double pf) {
		double total = basic + hq + ta + pf;
		System.out.println("Salary is updated,basic,hq,ta,pf:" + total);
	}
}

public class TestClass {

	public static void main(String[] args) {
		Employee em = new Employee();
		em.gen_Salary(102, 302);
		em.update_gen_salary(303, 45, 304, 209);
	}
}
