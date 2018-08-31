package com.capgeminiday2testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.day2.Armstrong;

class ArmstrongTest {

	@Test
	void test() {
		assertEquals(false,Armstrong.checkArmstrong(152));
		assertEquals(false,Armstrong.checkArmstrong(121));
		assertEquals(true,Armstrong.checkArmstrong(153));
	}

}
