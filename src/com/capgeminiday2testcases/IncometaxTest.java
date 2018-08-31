package com.capgeminiday2testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.day2.Incometax;

class IncometaxTest {

	@Test
	void test() {
		assertEquals(20000,Incometax.checkIncometax(200000),0.02);
		assertEquals(0,Incometax.checkIncometax(20000),0.02);

	}

}
