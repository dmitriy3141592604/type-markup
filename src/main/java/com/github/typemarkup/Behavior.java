package com.github.typemarkup;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Позволяет задать краткое описание ожидаемого поведения метода. Может
 * использоваться для тестовых методов, совместно с аннотацией
 * <code>@Test</code>
 *
 * @author dmitriy3141592604
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD })
public @interface Behavior {

	/**
	 * Строка с описанием поведения метода.
	 *
	 * @return Описание поведения.
	 */
	String value();
}
