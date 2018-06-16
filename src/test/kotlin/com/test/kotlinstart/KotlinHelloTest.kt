package com.test.kotlinstart

import com.test.kotlinstart.getHelloStringFromJava
import com.test.kotlinstart.getHelloStringFromKotlin
import kotlin.test.assertEquals
import org.junit.Test

class KotlinHelloTest {
	@Test
	fun testAssert(): Unit {
		assertEquals("Hello from Java!", getHelloStringFromJava())
		assertEquals("Hello from Kotlin!", getHelloStringFromKotlin())
	}
}
