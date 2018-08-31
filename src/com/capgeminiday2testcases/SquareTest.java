package com.capgeminiday2testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.day2.Square;

class SquareTest {

	@Test
	void test() {
		assertEquals(100,Square.squareOfaNumber(10));
		assertEquals(25,Square.squareOfaNumber(-5));
	}

}
