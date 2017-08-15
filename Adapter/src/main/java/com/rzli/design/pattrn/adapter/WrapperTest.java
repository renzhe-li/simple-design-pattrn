package com.rzli.design.pattrn.adapter;

import com.rzli.design.pattrn.adapter.container.SourceSub1;
import com.rzli.design.pattrn.adapter.container.SourceSub2;
import com.rzli.design.pattrn.adapter.source.Sourceable;

/**
 * http://www.cnblogs.com/maowang1991/archive/2013/04/15/3023236.html
 * 
 * @author renzhe.li
 *
 */
public class WrapperTest {

	public static void main(String[] args) {

		Sourceable source1 = new SourceSub1();
		source1.method1();
		source1.method2();

		Sourceable source2 = new SourceSub2();
		source2.method1();
		source2.method2();
	}
}
