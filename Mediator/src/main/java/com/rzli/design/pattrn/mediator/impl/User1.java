package com.rzli.design.pattrn.mediator.impl;

import com.rzli.design.pattrn.mediator.in.Mediator;
import com.rzli.design.pattrn.mediator.in.User;

public class User1 extends User {

	public User1(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void work() {
		System.out.println("user1 exe!");
	}

}
