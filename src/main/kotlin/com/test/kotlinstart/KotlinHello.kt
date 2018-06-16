package com.test.kotlinstart

import com.test.kotlinstart.JavaHello

fun getHelloStringFromKotlin(): String {
	return "Hello from Kotlin!"
}

fun getHelloStringFromJava(): String {
	return JavaHello.getHelloStringFromJava();
}