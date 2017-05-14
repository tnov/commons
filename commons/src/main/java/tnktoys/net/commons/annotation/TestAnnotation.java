/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tnktoys.net.commons.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

@TestClassAnnotation(value="class")
public class TestAnnotation {

	@TestFieldAnnotation(value="field")
	private String data;

	@TestMethodAnnotation(value="method")
	public void sampleMethod(@TestParameterAnnotation("parameter")String param) {

	}

	@TestConstructorAnnotation(value="constructor")
	public TestAnnotation() {
		data = "test";
	}

	public static void main(String[] args) {
		TestAnnotation annotation = new TestAnnotation();
		getInfo(annotation);
	}

	private static void getInfo(TestAnnotation test) {
		Annotation[] classAnnotations = test.getClass().getAnnotations();
		for (Annotation classAnnotation : classAnnotations) {
			System.out.println(classAnnotation.annotationType().getName());

			Constructor[] constructors = test.getClass().getConstructors();
			for (Constructor constructor : constructors) {
				Annotation[] constructorAnnotations = constructor.getAnnotations();
				for (Annotation constructorAnnotation : constructorAnnotations) {
					System.out.println(constructorAnnotation.annotationType().getName());
				}
			}			Field[] fields = test.getClass().getDeclaredFields();
			for (Field field : fields) {
				Annotation[] fieldAnnotations = field.getAnnotations();
				for (Annotation fieldAnnotation : fieldAnnotations) {
					System.out.println(fieldAnnotation.annotationType().getName());
				}
			}
			Method[] methods = test.getClass().getDeclaredMethods();
			for (Method method : methods) {
				Annotation[] methodAnnotations = method.getAnnotations();
				for (Annotation methodAnnotation : methodAnnotations) {
					System.out.println(methodAnnotation.annotationType().getName());
				}
				Parameter[] parameters = method.getParameters();
				for (Parameter parameter : parameters) {
					Annotation[] parameterAnnotations = parameter.getAnnotations();
					for (Annotation parameterAnnotation : parameterAnnotations) {
						System.out.println(parameterAnnotation.annotationType().getName());
					}
				}
			}
		}
	}
}
