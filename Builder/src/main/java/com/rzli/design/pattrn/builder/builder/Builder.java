package com.rzli.design.pattrn.builder.builder;

import java.util.ArrayList;
import java.util.List;

import com.rzli.design.pattrn.builder.impl.MailSender;
import com.rzli.design.pattrn.builder.impl.SmsSender;
import com.rzli.design.pattrn.builder.in.Sender;

public class Builder {

	private static final List<Sender> list = new ArrayList<Sender>();

	public void produceMailSender(final int count) {
		int i = 0;
		while (i < count) {
			list.add(new MailSender());
			i++;
		}
	}

	public void produceSmsSender(final int count) {
		int i = 0;
		while (i < count) {
			list.add(new SmsSender());
			i++;
		}
	}
}
