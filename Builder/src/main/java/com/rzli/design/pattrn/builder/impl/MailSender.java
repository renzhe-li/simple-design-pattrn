package com.rzli.design.pattrn.builder.impl;

import com.rzli.design.pattrn.builder.in.Sender;

public class MailSender implements Sender {

	@Override
	public void send() {

		System.out.println("This is mail sender!");
	}

}
