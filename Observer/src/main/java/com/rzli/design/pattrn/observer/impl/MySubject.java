package com.rzli.design.pattrn.observer.impl;

import com.rzli.design.pattrn.observer.in.AbstractSubject;

public class MySubject extends AbstractSubject {

	@Override
	public void operation() {

		System.out.println("update self!");
		notifyObservers();
	}

}
