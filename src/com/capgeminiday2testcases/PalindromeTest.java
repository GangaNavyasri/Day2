package com.capgeminiday2testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.day2.Palindrome;

class PalindromeTest {

	@Test
	void testCheckPalindrome() {
		assertEquals(true,Palindrome.checkPalindrome(121));
		assertEquals(false,Palindrome.checkPalindrome(153));
		
	}

}
