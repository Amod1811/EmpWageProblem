package com.bridgelabz.employeewagcomp;

public class PartTimeU3 {

	public static int IS_FULL_TIME = 1;
	public static int IS_PART_TIME = 2;
	public static int EMP_RATE_PER_HOUR = 20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variables
		int empHrs = 0;
		int empWage = 20;
		//computation
		double empCheck = Math.floor(Math.random() * 10 ) % 3;
		if (empCheck == IS_FULL_TIME)
			empHrs = 12;
		else if (empCheck == IS_PART_TIME)
			empHrs = 8;
		else
			empHrs = 0;
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage : " + empWage);

	}

}
