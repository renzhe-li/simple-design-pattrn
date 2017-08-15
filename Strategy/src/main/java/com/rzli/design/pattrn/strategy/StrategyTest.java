package com.rzli.design.pattrn.strategy;

import com.rzli.design.pattrn.strategy.in.ICalculator;
import com.rzli.design.pattrn.strategy.service.CalculateTypeService;

/**
 * http://www.cnblogs.com/maowang1991/archive/2013/04/15/3023236.html
 * 
 * 策略模式（strategy）<br>
 * 
 * 策略模式定义了一系列算法，并将每个算法封装起来，使他们可以相互替换，且算法的变化不会影响到使用算法的客户。<br>
 * 需要设计一个接口，为一系列实现类提供统一的方法，多个实现类实现该接口，设计一个抽象类（可有可无，属于辅助类），提供辅助函数
 * 
 * @author renzhe.li
 *
 */
public class StrategyTest {

	public static void main(String[] args) {
		CalculateTypeService calcualtypeService = new CalculateTypeService();

		String exp = "2+8";
		ICalculator cal = calcualtypeService.calculateType(exp);
		int result = cal.calculate(exp);
		System.out.println(result);
	}
}
