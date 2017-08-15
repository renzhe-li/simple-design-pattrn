package com.rzli.design.pattrn.proxy;

import com.rzli.design.pattrn.proxy.impl.Proxy;
import com.rzli.design.pattrn.proxy.in.Sourceable;

/**
 * http://www.cnblogs.com/maowang1991/archive/2013/04/15/3023236.html
 * 
 * 代理模式（Proxy）<br>
 * 
 * 每个模式名称就表明了该模式的作用，代理模式就是多一个代理类出来，替原对象进行一些操作 <br>
 * 
 * 代理模式的应用场景：<br>
 * 
 * 1、修改原有的方法来适应。这样违反了“对扩展开放，对修改关闭”的原则。<br>
 * 2、就是采用一个代理类调用原有的方法，且对产生的结果进行控制。 <br>
 * 
 * @author renzhe.li
 *
 */
public class ProxyTest {

	public static void main(String[] args) {

		final Sourceable source = new Proxy();
		source.method();
	}
}
