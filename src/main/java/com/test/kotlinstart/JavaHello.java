package com.test.kotlinstart;

import com.test.kotlinstart.KotlinHelloKt;

public class JavaHello {
	public static String JavaHelloString = "Hello from Java!";

	public static String getHelloStringFromKotlin() {
		return KotlinHelloKt.getHelloStringFromKotlin();
	}

	public static String getHelloStringFromJava() {
		return JavaHelloString;
	}

}
