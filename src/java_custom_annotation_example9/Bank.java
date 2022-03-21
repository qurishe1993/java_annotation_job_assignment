package java_custom_annotation_example9;

import java.lang.annotation.*;

/*--
 * Declare user defined Annotation
 * --*/
@Inherited
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Bank {
	String name() default "IBBL";

	String branch() default "Savar-Branch";

	String phone() default "09580347567";
}
