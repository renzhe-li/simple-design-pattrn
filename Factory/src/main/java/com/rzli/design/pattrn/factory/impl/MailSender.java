package com.rzli.design.pattrn.factory.impl;

import com.rzli.design.pattrn.factory.in.Sender;

public class MailSender implements Sender {

	@Override
	public void send() {

		System.out.println("This is mail sender!");
	}

}
