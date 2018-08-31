package com.day2;

public class Palindrome {

	public static boolean checkPalindrome(int num) {
		
		int temp = num;
		int rem;
		int rev = 0;
		while (num > 0) {
			rem = num % 10;
			rev = (rev * 10 )+ rem;
			num = num / 10;
		}
		if (temp == rev)
			return true;
		else
			return false;
	}

}
