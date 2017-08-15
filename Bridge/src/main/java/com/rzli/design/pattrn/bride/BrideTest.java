package com.rzli.design.pattrn.bride;

import com.rzli.design.pattrn.bride.container.Bridge;
import com.rzli.design.pattrn.bride.container.MyBridge;
import com.rzli.design.pattrn.bride.impl.SourceSub1;
import com.rzli.design.pattrn.bride.impl.SourceSub2;
import com.rzli.design.pattrn.bride.in.Sourceable;

/**
 * http://www.cnblogs.com/maowang1991/archive/2013/04/15/3023236.html
 * 
 * 桥接模式（Bridge）<br>
 * 
 * 桥接模式就是把事物和其具体实现分开，使他们可以各自独立的变化。<br>
 * 桥接的用意是：将抽象化与实现化解耦，使得二者可以独立变化
 * 
 * @author renzhe.li
 *
 */
public class BrideTest {

	public static void main(String[] args) {

		final Bridge bridge = new MyBridge();

		/** 调用第一个对象 */
		final Sourceable source1 = new SourceSub1();
		bridge.setSource(source1);
		bridge.method();

		/** 调用第二个对象 */
		Sourceable source2 = new SourceSub2();
		bridge.setSource(source2);
		bridge.method();
	}
}
