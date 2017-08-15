package com.rzli.design.pattrn.proxy.impl;

import com.rzli.design.pattrn.proxy.in.Sourceable;

public class Source implements Sourceable {

	@Override
	public void method() {
		System.out.println("the original method!");
	}

}
