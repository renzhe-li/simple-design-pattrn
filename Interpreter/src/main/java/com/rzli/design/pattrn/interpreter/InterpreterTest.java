package com.rzli.design.pattrn.interpreter;

import com.rzli.design.pattrn.interpreter.dto.Context;
import com.rzli.design.pattrn.interpreter.impl.Minus;
import com.rzli.design.pattrn.interpreter.impl.Plus;

/**
 * http://www.cnblogs.com/maowang1991/archive/2013/04/15/3023236.html
 * 
 * 解释器模式（Interpreter）<br>
 * 
 * Context类是一个上下文环境类，Plus和Minus分别是用来计算的实现
 * 
 * @author renzhe.li
 *
 */
public class InterpreterTest {

	public static void main(String[] args) {

		// 计算9+2-8的值
		int result = new Minus().interpret((new Context(new Plus().interpret(new Context(9, 2)), 8)));
		System.out.println(result);
	}
}
