package com.rzli.design.pattrn.adapter;

import com.rzli.design.pattrn.adapter.container.Adapter;
import com.rzli.design.pattrn.adapter.container.Wrapper;
import com.rzli.design.pattrn.adapter.target.Targetable;

/**
 * http://www.cnblogs.com/maowang1991/archive/2013/04/15/3023236.html
 * 
 * @author renzhe.li
 *
 */
public class AdapterTest {

	public static void main(String[] args) {
		final Targetable targetable = new Adapter();
		targetable.method1();
		targetable.method2();

		final Targetable targetable2 = new Wrapper();
		targetable2.method1();
		targetable2.method2();
	}
}
