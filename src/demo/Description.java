package demo;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface Description {
	String value() default "";

	int age() default 0;

	Author author();

	String[] arrays() default {};

	public enum Color {
		RED, BLACK, GREEN
	};

	Color color() default Color.RED;

}
