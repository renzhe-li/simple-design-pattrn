package com.rzli.design.pattrn.builder;

import com.rzli.design.pattrn.builder.builder.Builder;

/**
 * http://www.cnblogs.com/maowang1991/archive/2013/04/15/3023236.html
 * 
 * 建造者模式（Builder） <br>
 * 工厂类模式提供的是创建单个类的模式，而建造者模式则是将各种产品集中起来进行管理，用来创建复合对象，所谓复合对象就是指某个类具有不同的属性
 * 
 * @author renzhe.li
 *
 */
public class BuilderTest {

	public static void main(String[] args) {
		Builder builder = new Builder();

		builder.produceMailSender(1);
		builder.produceMailSender(10);
	}
}
