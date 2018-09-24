package com.privalia.business.integration.test;


import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.privalia.business.Calculator;
import com.privalia.business.iCalculator;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class CalculatorParametrizedTest {
	@Test
	@Parameters({"0,0,0","1,1,2"})
	public void ShouldReturnCorrectSum(int first, int second, int expectedSum){
		iCalculator calculator = new Calculator();
		int actualSum = calculator.sum(first, second);
		assertTrue(actualSum==expectedSum);
	}
	
	@Test
	@Parameters({"4,2,2","1,1,0"})
	public void ShouldReturnCorrectSubstract(int first, int second, int expectedSubstract){
		iCalculator calculator = new Calculator();
		int actualSubstract = calculator.substract(first, second);
		assertTrue(actualSubstract==expectedSubstract);
	}	
	
	@Test
	@Parameters({"4,2,8","1,1,1"})
	public void ShouldReturnCorrectMultiply(int first, int second, int expectedMultiply){
		iCalculator calculator = new Calculator();
		int actualMultiply = calculator.multiply(first, second);
		assertTrue(actualMultiply==expectedMultiply);
	}
	
	@Test
	@Parameters({"4,2,2","2,1,2"})
	public void ShouldReturnCorrectDivide(int first, int second, int expectedDivide){
		iCalculator calculator = new Calculator();
		int actualDivide = calculator.divide(first, second);
		assertTrue(actualDivide==expectedDivide);
	}
}
