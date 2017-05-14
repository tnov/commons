/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tnktoys.net.commons.annotation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;

public class Intercepter implements InvocationHandler {
	private static HashMap<String,String> elements;
	static {
		elements = new HashMap<>();
	}

	// インターセプターのインスタンスはクラスロード時に呼び出しなしで行う。
	// クラス探してアノテーション探して保持しておく。
	// 実行時に必要に応じてAOPする。
	public Intercepter() {
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		return null;
	}

}