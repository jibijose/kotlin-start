package com.test.kotlinstart;

import com.test.kotlinstart.JavaHello;
import junit.framework.TestCase;
import com.test.kotlinstart.KotlinHelloKt;

public class JavaHelloTest extends TestCase {
	public void testAssert() {
		assertEquals("Hello from Java!", JavaHello.getHelloStringFromJava());
		assertEquals("Hello from Kotlin!", JavaHello.getHelloStringFromKotlin());
		assertEquals("Hello from Java!", KotlinHelloKt.getHelloStringFromJava());
		assertEquals("Hello from Kotlin!", KotlinHelloKt.getHelloStringFromKotlin());
	}
}
