package com.rzli.design.pattrn.template.method;

import com.rzli.design.pattrn.template.method.impl.Plus;
import com.rzli.design.pattrn.template.method.in.AbstractCalculator;

/**
 * http://www.cnblogs.com/maowang1991/archive/2013/04/15/3023236.html
 * 
 * 模板方法模式（Template Method）<br>
 * 
 * 一个抽象类中，有一个主方法，再定义1...n个方法，可以是抽象的，也可以是实际的方法 <br>
 * 定义一个类，继承该抽象类，重写抽象方法，通过调用抽象类，实现对子类的调用
 * 
 * @author renzhe.li
 *
 */
public class TemplateMethodTest {

	public static void main(String[] args) {
		String exp = "8+8";
		AbstractCalculator cal = new Plus();

		int result = cal.calculate(exp, "\\+");
		System.out.println(result);
	}
}
