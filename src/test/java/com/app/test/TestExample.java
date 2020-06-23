package com.app.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestExample {
	@BeforeClass
	public static void oneTimeBefore() {
		System.out.println("Before All...");
	}

	@Before
	public void preWork() {
		System.out.println("before...");
	}

	@Test
	public void testA() {
		System.out.println("Test-1");
	}

	@Test
	public void testB() {
		System.out.println("Test-2");
	}

	@Test
	public void testC() {
		System.out.println("Test-3");
	}

	@After
	public void postWork() {
		System.out.println("After...");
	}

	@AfterClass
	public static void oneTimeAfter() {
		System.out.println("After All...");
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
