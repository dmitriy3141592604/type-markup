package com.github.typemarkup;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PACKAGE;
import static java.lang.annotation.ElementType.TYPE;

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
@Target({ TYPE, METHOD, FIELD, LOCAL_VARIABLE, PACKAGE })
@Responsibility("Отвечает за описание ответственности аннотированной сущьности")
public @interface Responsibility {

	/**
	 * Строка, описывающая ответственность класса или метода.
	 *
	 * @return Строковое представление ответственности класса или метода.
	 */
	@Responsibility("Предоставляет возможность получения текстового описания ответственности аннотированной сущьности")
	String value();
}
