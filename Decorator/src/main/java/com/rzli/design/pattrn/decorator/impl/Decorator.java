package com.rzli.design.pattrn.decorator.impl;

import com.rzli.design.pattrn.decorator.in.Sourceable;

public class Decorator implements Sourceable {

	private transient Sourceable source;

	public Decorator(Sourceable source) {
		super();
		this.source = source;
	}

	@Override
	public void method() {
		System.out.println("before decorator!");
		source.method();
		System.out.println("after decorator!");
	}

}
