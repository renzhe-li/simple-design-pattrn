package com.rzli.design.pattrn.mediator.impl;

import com.rzli.design.pattrn.mediator.in.Mediator;
import com.rzli.design.pattrn.mediator.in.User;

public class User2 extends User {

	public User2(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void work() {
		System.out.println("user2 exe!");
	}
}
