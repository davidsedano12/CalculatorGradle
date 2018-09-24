package com.privalia.business.integration.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.privalia.business.Calculator;
import com.privalia.business.iCalculator;

public class CalculatorTest {
	iCalculator calculator = new Calculator();

	@Test
	public void testSum() {
		//usamos la interfax icalculator en vez de la clase pork me quita lo sobrante
		assertTrue(calculator.sum(2, 3)==5);
	}

	@Test
	public void testSubstract() {
		assertTrue(calculator.substract(2, 2)==0);
	}

	@Test
	public void testMultiply() {
		assertTrue(calculator.multiply(2, 3)==6);
	}

	@Test
	public void testDivide() {
		assertTrue(calculator.divide(2, 2)==1);
	}

}
