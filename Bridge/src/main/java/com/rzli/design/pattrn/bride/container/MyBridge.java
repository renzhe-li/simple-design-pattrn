package com.rzli.design.pattrn.bride.container;

public class MyBridge extends Bridge {

	@Override
	public void method() {
		getSource().method();
	}
}
