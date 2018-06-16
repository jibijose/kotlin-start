package com.test.kotlinstart;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class JavaAppTest extends TestCase {
	public JavaAppTest(String testName) {
		super(testName);
	}

	public static Test suite() {
		return new TestSuite(JavaAppTest.class);
	}

	public void testApp() {
		assertTrue(true);
	}
}
