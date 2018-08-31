package com.capgeminiday2testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.day2.MultiDimension;

class MultidimensionalTest {

	@Test
	void test() {

		assertEquals("found",MultiDimension.searchElement(new int[][] {{1,2},{3,4}}));
	}

}
