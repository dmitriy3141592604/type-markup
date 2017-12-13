package com.github.typemarkup;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Позволяет задать описание ответственности класса или метода.
 *
 * @author dmitriy3141592604
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.METHOD })
public @interface Responsibility {

	/**
	 * Строка, описывающая ответственность класса или метода.
	 *
	 * @return Строковое представление ответственности класса или метода.
	 */
	String value();
}
