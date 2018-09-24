package com.privalia.business;

public interface iCalculator {
	// no pongo public, porque por def. los metodos de la interfaz ya lo son
	// KISS
	int sum(int num1, int num2);

	int substract(int num1, int num2);

	int multiply(int num1, int num2);

	int divide(int num1, int num2);
}
