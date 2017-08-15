package com.rzli.design.pattrn.factory;

import com.rzli.design.pattrn.factory.factory.SendMailFactory;
import com.rzli.design.pattrn.factory.in.Provider;
import com.rzli.design.pattrn.factory.in.Sender;

/**
 * http://www.cnblogs.com/maowang1991/archive/2013/04/15/3023236.html <br>
 * 
 * 抽象工厂模式（Abstract Factory<br>
 * 优点：增加一个功能，则只需做一个实现类，实现Sender接口，同时做一个工厂类，实现Provider接口，无需改动现成代码，拓展性较好
 * 
 * @author renzhe.li
 *
 */
public class AbstractFactoryTest {

	public static void main(String[] args) {
		final Provider provider = new SendMailFactory();
		final Sender sender = provider.produce();
		sender.send();
	}
}
