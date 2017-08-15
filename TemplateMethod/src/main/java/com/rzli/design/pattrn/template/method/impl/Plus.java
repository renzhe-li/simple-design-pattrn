package com.rzli.design.pattrn.template.method.impl;

import com.rzli.design.pattrn.template.method.in.AbstractCalculator;

public class Plus extends AbstractCalculator {

	@Override
	public int calculate(int num1, int num2) {

		return num1 + num2;
	}

}
