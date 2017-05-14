/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tnktoys.net.commons.annotation;

public interface TestInterface {
	// アノテーションだけでなにかできるように
	public default String getData(String testData) {
		return testData;
	}
}
