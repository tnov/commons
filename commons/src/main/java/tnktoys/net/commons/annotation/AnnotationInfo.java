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

public class AnnotationInfo<T> {

	public enum ANOTATION_TYPE {CLASS,CONSTRACTOR,METHOD,FIELD,PARAMETER}

	public AnnotationInfo(Class<T> clazz) {
		Annotation[] classAnnotations = clazz.getAnnotations();
		for (Annotation classAnnotation : classAnnotations) {
			System.out.println(classAnnotation.annotationType().getName());

			Constructor[] constructors = clazz.getConstructors();
			for (Constructor constructor : constructors) {
				Annotation[] constructorAnnotations = constructor.getAnnotations();
				for (Annotation constructorAnnotation : constructorAnnotations) {
					System.out.println(constructorAnnotation.annotationType().getName());
				}
			}			Field[] fields = clazz.getDeclaredFields();
			for (Field field : fields) {
				Annotation[] fieldAnnotations = field.getAnnotations();
				for (Annotation fieldAnnotation : fieldAnnotations) {
					System.out.println(fieldAnnotation.annotationType().getName());
				}
			}
			Method[] methods = clazz.getDeclaredMethods();
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

	public static void main(String[] args) {
	}

}
