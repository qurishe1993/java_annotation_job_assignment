package java_smultivalued_valued_annotation_example3;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MultiValuedAnnotation {
	int id();

	String name();

	String address();
}

public class MultiValued {

	@MultiValuedAnnotation(id = 101, name = "Wornoz", address = "Dhaka")
	public void MultiDisplay() {
		try {
			Class<? extends MultiValued> cls = this.getClass();
			Method m = cls.getMethod("MultiDisplay");
			MultiValuedAnnotation mva = m.getAnnotation(MultiValuedAnnotation.class);
			System.out.println("ID is:" + mva.id() + "\nName is:" + mva.name() + "\nAddress is :" + mva.address());
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		MultiValued mv = new MultiValued();
		mv.MultiDisplay();

	}
}
