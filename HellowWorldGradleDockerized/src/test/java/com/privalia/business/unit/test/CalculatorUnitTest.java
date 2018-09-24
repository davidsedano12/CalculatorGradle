package com.privalia.business.unit.test;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.Before;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.privalia.business.iCalculator;

public class CalculatorUnitTest {
	@Mock
	iCalculator icalculator;

	@Before
	public void setUp() throws Exception {
		// aqui se podria hacer el when
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testAdd() {
		when(icalculator.sum(2, 3)).thenReturn(5);
		assertTrue(icalculator.sum(2, 3) == 5);
	}

	@Test
	public void testSubstract() {
		when(icalculator.substract(3, 3)).thenReturn(0);
		assertTrue(icalculator.substract(3, 3) == 0);
	}

	@Test
	public void testDivide() {
		when(icalculator.divide(4, 2)).thenReturn(2);
		assertTrue(icalculator.divide(4, 2) == 2);
	}

	@Test
	public void testMultiply() {
		when(icalculator.multiply(4, 2)).thenReturn(8);
		assertTrue(icalculator.multiply(4, 2) == 8);
	}

}
