package com.rzli.design.pattrn.flyweight.impl;

import com.rzli.design.pattrn.flyweight.dto.User;
import com.rzli.design.pattrn.flyweight.in.FlyWeightIn;

/**
 * 不需要进行构造，可以从内部状态组合成为一致的对象外部状态
 * 
 * @author renzhe.li
 *
 */
public class UnShareConcreteFW implements FlyWeightIn {

	@Override
	public User operation() {
		return null;
	}

}
