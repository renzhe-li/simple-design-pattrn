package com.rzli.design.pattrn.factory.impl;

import com.rzli.design.pattrn.factory.in.Sender;

public class SmsSender implements Sender {

	@Override
	public void send() {

		System.out.println("This is sms sender!");
	}

}
