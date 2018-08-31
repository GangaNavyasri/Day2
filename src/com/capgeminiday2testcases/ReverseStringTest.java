package com.capgeminiday2testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.day2.ReverseString;

class ReverseStringTest {

	@Test
	void test() {
		assertEquals("ayvan ",ReverseString.findReverse("navya"));
		}
	}

