package java_inhereted_annotation_example8;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface UninheritedAnnotationType {
	String value1() default "this is uninherited interface";
}
