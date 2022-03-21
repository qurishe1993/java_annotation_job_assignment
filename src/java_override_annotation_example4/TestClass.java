package java_override_annotation_example4;

class A {
	public void getDisplay() {
		System.out.println("Super class A");
	}
}

class B extends A{
	@Override
	public void getDisplay() {
		System.out.println("Sub class B");
	}
}

public class TestClass {
	public static void main(String[] args) {
		A a=new B();
		a.getDisplay();
	}
}
