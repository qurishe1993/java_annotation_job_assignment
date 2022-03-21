package java_single_valued_annotation_example2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface SingleValuedAnno {
	int value();
	/* this variable name must be value */
}

public class Single {
	/* annotate a method using a single member annotation */
	@SingleValuedAnno(10)
	public void mysingleanno() {
		try {
			Class<? extends Single> cls = this.getClass();
			Method m = cls.getMethod("mysingleanno");
			SingleValuedAnno siganno = m.getAnnotation(SingleValuedAnno.class);
			System.out.println(siganno.value());
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		Single sg = new Single();
		sg.mysingleanno();
	}
}
