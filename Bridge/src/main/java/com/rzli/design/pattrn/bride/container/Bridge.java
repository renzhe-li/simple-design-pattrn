package com.rzli.design.pattrn.bride.container;

import com.rzli.design.pattrn.bride.in.Sourceable;

public abstract class Bridge {

	private Sourceable source;

	public void method() {
		source.method();
	}

	public Sourceable getSource() {
		return source;
	}

	public void setSource(Sourceable source) {
		this.source = source;
	}
}
