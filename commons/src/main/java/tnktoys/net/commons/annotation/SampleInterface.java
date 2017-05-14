/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tnktoys.net.commons.annotation;

public interface SampleInterface extends TestInterface {

	@TestMethodAnnotation(value="method")
	public String getString(@TestParameterAnnotation(value="param") String msg);
}
