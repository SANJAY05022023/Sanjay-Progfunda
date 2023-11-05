package com.gradedprojectQ1;

public class Main {

	public static void main(String[] args) {
		
		//Admin Department
		AdminDepartment admin = new AdminDepartment();
		System.out.println("Welcome To " +admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayHoliday());
		System.out.println();
	
		
		
		//Hr Department
		HrDepartment hr = new HrDepartment();
		System.out.println("Welcome to" + hr.departmentName());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.doActivity());
		System.out.println(hr.isTodayHoliday());
		System.out.println();
		
		
		//tech Department
		TechDepartment tech = new TechDepartment();
		System.out.println("Welcome To" +tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayHoliday());

	}

}
