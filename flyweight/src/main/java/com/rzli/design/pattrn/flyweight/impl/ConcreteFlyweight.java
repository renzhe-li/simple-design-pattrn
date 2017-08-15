package com.rzli.design.pattrn.flyweight.impl;

import com.rzli.design.pattrn.flyweight.dto.User;
import com.rzli.design.pattrn.flyweight.in.FlyWeightIn;

/**
 * 返回相同的对象
 * 
 * @author renzhe.li
 *
 */
public class ConcreteFlyweight implements FlyWeightIn {

	private transient User user;

	/**
	 * 传入享元的对象
	 * 
	 * @param user
	 */
	public ConcreteFlyweight(final User user) {
		this.user = user;
	}

	/**
	 * 可以对细粒度进行操作
	 */
	@Override
	public User operation() {
		return user;
	}

}
