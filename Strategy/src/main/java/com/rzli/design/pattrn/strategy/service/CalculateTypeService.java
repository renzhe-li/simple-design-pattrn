package com.rzli.design.pattrn.strategy.service;

import com.rzli.design.pattrn.strategy.impl.Minus;
import com.rzli.design.pattrn.strategy.impl.Multiply;
import com.rzli.design.pattrn.strategy.impl.Plus;
import com.rzli.design.pattrn.strategy.in.ICalculator;

public class CalculateTypeService {

	public ICalculator calculateType(final String exp) {
		if (exp.contains("+")) {
			return new Plus();
		}

		if (exp.contains("-")) {
			return new Minus();
		}

		return new Multiply();
	}
}
