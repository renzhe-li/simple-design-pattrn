package com.rzli.design.pattrn.interpreter.impl;

import com.rzli.design.pattrn.interpreter.dto.Context;
import com.rzli.design.pattrn.interpreter.in.Expression;

public class Minus implements Expression {

	@Override
	public int interpret(Context context) {
		return context.getNum1() - context.getNum2();
	}

}
