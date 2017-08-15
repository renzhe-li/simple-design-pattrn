package com.rzli.design.pattrn.command.impl;

import com.rzli.design.pattrn.command.in.Command;

public class Invoker {

	private Command command;

	public Invoker(Command command) {
		this.command = command;
	}

	public void action() {
		command.exe();
	}
}
