package java_marker_annotation_example1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker {
	// this is a marker annotation
	// marker annotation will be without members
}

public class Marker {

	@MyMarker
	public void myMethod() {
		try {
			Class<? extends Marker> cls = this.getClass();
			Method m = cls.getMethod("myMethod");
			if (m.isAnnotationPresent(MyMarker.class)) {
				System.out.println("MyMarker is present");
			} else {
				System.out.println("MyMarker is not found");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		Marker mk = new Marker();
		mk.myMethod();

	}
}
