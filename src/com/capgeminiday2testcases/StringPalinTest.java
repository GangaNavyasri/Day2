package com.capgeminiday2testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.day2.StringofPalin;

class StringPalinTest {

	@Test
		void test()
		{
			assertArrayEquals(new String[] {"121", "787","545", "454", null, null, null, null, null, null}, StringofPalin.orderPalindromes(new String[] {"121","154","234","787","545","454","678","789","876","890"}));
		}

}
