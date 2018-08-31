package com.capgeminiday2testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.day2.NumberOfOccurances;

class NumberOfOccurancesTest {

	@Test
		void testOccurances() {
			assertEquals(2,NumberOfOccurances.findNumberOfOccurances(new String[] {"Sam", "Priya","Mali","Raj","Ram","George","Sam"}, new String("Sam")));
			
	}

}
