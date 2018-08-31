package com.capgeminiday2testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.day2.Marks;

class MarksTest {

	@Test
	void test() {
		assertEquals("Promoted",Marks.resultOfAStudent(70,40,60));
		assertEquals("Promoted",Marks.resultOfAStudent(60,40,60));
		assertEquals("Passed",Marks.resultOfAStudent(75,70,61));
		assertEquals("Failed",Marks.resultOfAStudent(40,40,60));

	}

}
