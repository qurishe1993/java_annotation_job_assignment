package java_inhereted_annotation_example8;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface InheritedAnnotationType {
	String value1() default "this is inherited interface";
}
