package com.rzli.design.pattrn.factory.factory;

import java.util.HashMap;

import com.rzli.design.pattrn.factory.impl.MailSender;
import com.rzli.design.pattrn.factory.impl.SmsSender;
import com.rzli.design.pattrn.factory.in.Sender;

public class SendFactory {

	private static final HashMap<String, Sender> sendMap = new HashMap<>();

	public Sender getSender(final String senderName) {
		Sender sender = sendMap.getOrDefault(senderName, null);
		if (sender != null) {
			return sender;
		}

		if ("mailSender".equals(senderName)) {
			sender = new MailSender();
			sendMap.put(senderName, sender);
			return sender;
		}

		if ("smsSender".equals(senderName)) {
			sender = new SmsSender();
			sendMap.put(senderName, sender);
			return sender;
		}

		throw new RuntimeException("Can not get Sender : " + senderName);
	}

	public static Sender produceSender(final String senderName) {
		Sender sender = sendMap.getOrDefault(senderName, null);
		if (sender != null) {
			return sender;
		}

		if ("mailSender".equals(senderName)) {
			sender = new MailSender();
			sendMap.put(senderName, sender);
			return sender;
		}

		if ("smsSender".equals(senderName)) {
			sender = new SmsSender();
			sendMap.put(senderName, sender);
			return sender;
		}

		throw new RuntimeException("Can not get Sender : " + senderName);
	}
}
