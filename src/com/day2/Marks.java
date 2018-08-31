package com.day2;

public class Marks {

	public static String resultOfAStudent(int i, int j, int k) {
		int Subject1=i;
		int Subject2=j; 
		int Subject3=k;
		if (Subject1 >=60 && Subject2 >=60 &&  Subject3 >=60)
			return "Passed";
		else if (Subject1 >=60 && Subject2 >=60 || Subject2 >=60 && Subject3 >=60 || Subject3 >=60 && Subject1 >=60)
			return "Promoted";
		else
			return "Failed";
		
	}
}
