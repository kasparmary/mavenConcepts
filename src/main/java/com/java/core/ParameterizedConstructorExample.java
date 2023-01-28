package com.java.core;

import org.checkerframework.checker.initialization.qual.Initialized;

public class ParameterizedConstructorExample {

	String pri_lang;
	String sec_lang ;
	
	ParameterizedConstructorExample(String arg1, String arg2) {
		// TODO Auto-generated constructor stub
		pri_lang = arg1;
		sec_lang = arg2;
	}
	
	public void aboutMyLanguagePreferenes() {
		System.out.println("Parameter constructor called automatically when object get Initialized....");

		System.out.println(pri_lang + "----" + sec_lang);
	}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterizedConstructorExample paramCons = new ParameterizedConstructorExample("PHP", "JAVA");
		paramCons.aboutMyLanguagePreferenes();
	}

}
