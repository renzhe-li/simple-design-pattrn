package com.rzli.design.pattrn.interpreter.in;

import com.rzli.design.pattrn.interpreter.dto.Context;

public interface Expression {

	public int interpret(Context context);

}
