package com.bridgelabz.employeewagcomp;

public class EmployeeDailyWageUC2 {
	/*
	 * program to check whether employee is full time or part time 
	 * and calculate the employee wage 
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// constants
		int IS_FULL_TIME = 1;
		int EMP_RATE_PER_HOUR = 20;
		//variables
		int empHrs = 0;
		int empWage = 20;
		//computation
		double empCheck = Math.floor(Math.random() * 10 ) % 2;
		if (empCheck == IS_FULL_TIME)
			empHrs = 12;
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage : " + empWage);
		

	}

}
