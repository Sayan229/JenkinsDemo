package com.ibm.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ibm.math.Maths;

public class TestMaths {
	private static Maths math;

	@BeforeAll
	public static void init() {
		math = new Maths();
	}

	@Test
	public void testAdd() {
		assertEquals(30, math.add(10, 20));
	}

	@Test
	public void testSubs() {
		assertEquals(10, math.subs(20, 10));
	}

	@Test
	public void testDiv() {
		assertEquals(6, math.div(30, 5));
	}

	@Test
	public void testSquare() {
		assertEquals(25, math.square(5));
	}

	@Test
	public void notNullDiv() {
		assertThrows(ArithmeticException.class, () -> math.div(2, 0));
	}
}