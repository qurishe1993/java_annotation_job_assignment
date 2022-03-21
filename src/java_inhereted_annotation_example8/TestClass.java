package java_inhereted_annotation_example8;

public class TestClass {

	public static void main(String[] args) {
		System.out.println(new A().getClass().getAnnotation(InheritedAnnotationType.class));
		System.out.println(new B().getClass().getAnnotation(InheritedAnnotationType.class));
		System.out.println(new C().getClass().getAnnotation(InheritedAnnotationType.class));
		System.out.println("----------------------------------");
		System.out.println(new A().getClass().getAnnotation(UninheritedAnnotationType.class));
		System.out.println(new B().getClass().getAnnotation(UninheritedAnnotationType.class));
		System.out.println(new C().getClass().getAnnotation(UninheritedAnnotationType.class));
	}
}
