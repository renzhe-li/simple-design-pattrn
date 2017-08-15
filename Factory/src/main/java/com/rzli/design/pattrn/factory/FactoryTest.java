package com.rzli.design.pattrn.factory;

import com.rzli.design.pattrn.factory.factory.SendFactory;
import com.rzli.design.pattrn.factory.in.Sender;

/**
 * http://www.cnblogs.com/maowang1991/archive/2013/04/15/3023236.html <br>
 * 
 * 普通工厂模式 <br>
 * 描述：建立一个工厂类，对实现了同一接口的类进行实例的创建 <br>
 * 缺点:类的创建依赖工厂类，如果想要拓展程序，必须对工厂类进行修改，这违背了闭包原则
 * 
 * @author renzhe.li
 *
 */
public class FactoryTest {

	public static void main(String[] args) {
		final SendFactory sendFactory = new SendFactory();

		final Sender smsSender = sendFactory.getSender("smsSender");
		smsSender.send();

		final Sender mailSender = sendFactory.getSender("mailSender");
		mailSender.send();

		// final Sender unknownSender = sendFactory.getSender("unknown sender");
		// unknownSender.send();

		/** static factory methods */
		final Sender smsSender2 = SendFactory.produceSender("smsSender");
		smsSender2.send();
	}
}
