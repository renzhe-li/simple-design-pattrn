package com.rzli.design.pattrn.decorator.impl;

import com.rzli.design.pattrn.decorator.in.Sourceable;

public class Source implements Sourceable {

	@Override
	public void method() {
		System.out.println("the original method!");
	}

}
