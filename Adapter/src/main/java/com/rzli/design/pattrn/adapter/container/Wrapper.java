package com.rzli.design.pattrn.adapter.container;

import com.rzli.design.pattrn.adapter.source.Source;
import com.rzli.design.pattrn.adapter.target.Targetable;

/**
 * http://www.cnblogs.com/maowang1991/archive/2013/04/15/3023236.html
 * 
 * 对象的适配器模式 <br>
 * 
 * 基本思路和类的适配器模式相同，只是将Adapter类作修改，这次不继承Source类，而是持有Source类的实例，以达到解决兼容性的问题
 * 
 * @author renzhe.li
 *
 */
public class Wrapper implements Targetable {

	private transient final Source source;

	public Wrapper() {
		super();
		this.source = new Source();
	}

	public Wrapper(final Source source) {
		super();
		this.source = source;
	}

	@Override
	public void method1() {
		source.method1();
	}

	@Override
	public void method2() {
		System.out.println("this is Wrapper method!");
	}

	public Source getSource() {
		return source;
	}

}
