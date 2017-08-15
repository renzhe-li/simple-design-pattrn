package com.rzli.design.pattrn.proxy.impl;

import com.rzli.design.pattrn.proxy.in.Sourceable;

public class Proxy implements Sourceable {

	private final Source source;

	public Proxy() {
		super();
		this.source = new Source();
	}

	@Override
	public void method() {
		before();
		source.method();
		atfer();
	}

	private void before() {
		System.out.println("before proxy!");
	}

	private void atfer() {
		System.out.println("after proxy!");
	}

}
