package com.rzli.design.pattrn.observer.impl;

import com.rzli.design.pattrn.observer.in.Observer;

public class Observer2 implements Observer {

	@Override
	public void update() {

		System.out.println("observer2 has received!");
	}

}
