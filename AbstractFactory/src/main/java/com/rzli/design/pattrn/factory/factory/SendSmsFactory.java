package com.rzli.design.pattrn.factory.factory;

import com.rzli.design.pattrn.factory.impl.SmsSender;
import com.rzli.design.pattrn.factory.in.Provider;
import com.rzli.design.pattrn.factory.in.Sender;

public class SendSmsFactory implements Provider {

	@Override
	public Sender produce() {
		return new SmsSender();
	}

}
