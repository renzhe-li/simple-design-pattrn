package com.rzli.design.pattrn.mediator.impl;

import com.rzli.design.pattrn.mediator.in.Mediator;
import com.rzli.design.pattrn.mediator.in.User;

public class MyMediator implements Mediator {

	private User user1;

	private User user2;

	@Override
	public void createMediator() {

		user1 = new User1(this);
		user2 = new User2(this);
	}

	@Override
	public void workAll() {

		user1.work();
		user2.work();
	}

	public User getUser1() {
		return user1;
	}

	public User getUser2() {
		return user2;
	}

}
