package com.gradedprojectQ1;

abstract class SuperDepartment {
	
	//Creating departmentName method with String returntype
	public String  departmentName(){
		return "Super Department";
		
	}
	//Creating getTodaysWork method with String returntype
	public String  getTodaysWork(){
		return "no Work as of now";
		
	}
	//Creating getWorkDeadline method with String returntype
	public String  getWorkDeadline(){
		return "Nil";
		
	}
	//Creating isTodayHoliday method with String returntype
	public String isTodayHoliday(){
		return "Today is not a holiday";
		
	}
}
