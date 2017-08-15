package com.rzli.design.pattrn.factory.factory;

import com.rzli.design.pattrn.factory.impl.MailSender;
import com.rzli.design.pattrn.factory.in.Provider;
import com.rzli.design.pattrn.factory.in.Sender;

public class SendMailFactory implements Provider {

	@Override
	public Sender produce() {
		return new MailSender();
	}

}
