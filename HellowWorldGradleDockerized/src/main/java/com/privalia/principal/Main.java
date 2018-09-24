package com.privalia.principal;


import com.privalia.business.Calculator;
import com.privalia.business.iCalculator;
import com.privalia.model.Student;

public class Main {
	public static void main(String[] args) {
		iCalculator icalculator = new Calculator();
		StringBuilder stringBuilder = new StringBuilder("El resultado de la suma es ");
		System.out.println(stringBuilder.append(icalculator.sum(2, 2)));        

		Student student =new Student();
		
		student.addStudent();
	}	
	
}
