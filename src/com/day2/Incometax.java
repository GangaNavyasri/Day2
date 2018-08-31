package com.day2;

public class Incometax {

	public static double checkIncometax(int amount) {
		if(amount>0&&amount<=180000)
			return(0);
		else if(amount>=180001&& amount<=300000)
			return(20000);
		else if(amount>=300001 && amount<=500000)
		return(80000);
		else if(amount>=500001 && amount<=1000000)
			return(180000);
		 return amount;
	}

}
