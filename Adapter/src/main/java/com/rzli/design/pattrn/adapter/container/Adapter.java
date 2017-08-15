package com.rzli.design.pattrn.adapter.container;

import com.rzli.design.pattrn.adapter.source.Source;
import com.rzli.design.pattrn.adapter.target.Targetable;

/**
 * http://www.cnblogs.com/maowang1991/archive/2013/04/15/3023236.html
 * 
 * 类的适配器模式 <br>
 * 
 * Source类，拥有一个方法，待适配，目标接口时Targetable，通过Adapter类，将Source的功能扩展到Targetable
 * 
 * @author renzhe.li
 *
 */
public class Adapter extends Source implements Targetable {

	@Override
	public void method2() {
		System.out.println("this is targetable method!");
	}

}
