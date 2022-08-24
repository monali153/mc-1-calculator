package com.jap.calculator;

public class MathematicalCalculator {

	public int add(int num1, int num2) {
		return num1 + num2;
	}

	public int subtract(int num1, int num2) {
		return num1 - num2;
	}

	public int multiply(int num1, int num2) {
		return num1 * num2;
	}

	public int divide(int num1, int num2) {
		int result = 0;
		//write the code and handle the ArithmeticException
		try {
			if (num2 != 0 || num2 < 0) {
				result = num1 / num2;
			}
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		return result;
	}

	public int modulo(int num1, int num2) {
		return num1 % num2;
	}
}
