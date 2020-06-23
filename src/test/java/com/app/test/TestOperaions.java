package com.app.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.marlabs.Operations;

public class TestOperaions {

	Operations op = null;
	int val1, val2, exp;

	@Before
	public void preSetup() {
		op = new Operations();
		val1 = val2 = 1;
		exp = 2;
	}

	@Test
	public void test() {

		int res = op.doSum(val1, val2);
		assertEquals("DoSum is not working", exp, res);
	}

	@After
	public void postTest() {
		op = null;
		val1 = val2 = exp = 0;
		System.out.println();
	}
}
