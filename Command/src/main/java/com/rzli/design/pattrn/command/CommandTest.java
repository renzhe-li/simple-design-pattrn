package com.rzli.design.pattrn.command;

import com.rzli.design.pattrn.command.impl.Invoker;
import com.rzli.design.pattrn.command.impl.MyCommand;
import com.rzli.design.pattrn.command.impl.Receiver;
import com.rzli.design.pattrn.command.in.Command;

public class CommandTest {

	public static void main(String[] args) {

		Receiver receiver = new Receiver();
		Command cmd = new MyCommand(receiver);
		Invoker invoker = new Invoker(cmd);
		invoker.action();
	}
}
