package com.rzli.design.pattrn.state;

/**
 * http://www.cnblogs.com/maowang1991/archive/2013/04/15/3023236.html
 * 
 * 状态模式（State）<br>
 * 
 * 核心思想就是：当对象的状态改变时，同时改变其行为。<br>
 * 状态模式就两点：1、可以通过改变状态来获得不同的行为。2、其他对象能同时看到你的变化。
 * 
 * @author renzhe.li
 *
 */
public class StateTest {

	public static void main(String[] args) {
		State state = new State();
		Context context = new Context(state);

		// 设置第一种状态
		state.setValue("state1");
		context.method();

		// 设置第二种状态
		state.setValue("state2");
		context.method();
	}
}
