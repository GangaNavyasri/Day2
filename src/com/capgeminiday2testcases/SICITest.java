package com.capgeminiday2testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.day2.SICI;

class SICITest {

	@Test
	void test() {
		assertEquals(1.2,SICI.siciOfAValue(50,2,1.2));
		assertEquals(2.4,SICI.siciOfAValue(100,2,1.2));
		
	}

}
