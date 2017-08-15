package com.rzli.design.pattrn.command.impl;

import com.rzli.design.pattrn.command.in.Command;

public class MyCommand implements Command {

	private Receiver receiver;

	public MyCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}

	@Override
	public void exe() {
		receiver.action();
	}

}
