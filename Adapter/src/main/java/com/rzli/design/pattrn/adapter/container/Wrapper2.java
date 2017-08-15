package com.rzli.design.pattrn.adapter.container;

import com.rzli.design.pattrn.adapter.source.Sourceable;

/**
 * http://www.cnblogs.com/maowang1991/archive/2013/04/15/3023236.html
 * 
 * 接口的适配器模式 <br>
 * 
 * 有时我们写的一个接口中有多个抽象方法，当我们写该接口的实现类时，必须实现该接口的所有方法。 <br>
 * 然而并不是所有的方法都是我们需要的，有时只需要某一些，此处为了解决这个问题，我们引入了接口的适配器模式。 <br>
 * 借助于一个抽象类，该抽象类实现了该接口，实现了所有的方法，而我们不和原始的接口打交道，只和该抽象类取得联系，所以我们写一个类，继承该抽象类，重写我们需要的方法就行。
 * 
 * @author renzhe.li
 *
 */
public abstract class Wrapper2 implements Sourceable {

	@Override
	public void method1() {
	}

	@Override
	public void method2() {
	}

}
