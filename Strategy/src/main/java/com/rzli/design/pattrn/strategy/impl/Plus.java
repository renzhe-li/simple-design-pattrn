package com.rzli.design.pattrn.strategy.impl;

import com.rzli.design.pattrn.strategy.in.ICalculator;

public class Plus extends AbstractCalculator implements ICalculator {

	@Override
	public int calculate(String exp) {
		int arrayInt[] = split(exp, "\\+");
		return arrayInt[0] + arrayInt[1];
	}

}
