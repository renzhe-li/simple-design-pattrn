package com.rzli.design.pattrn.flyweight.factory;

import java.util.HashMap;

import com.rzli.design.pattrn.flyweight.dto.User;
import com.rzli.design.pattrn.flyweight.impl.ConcreteFlyweight;
import com.rzli.design.pattrn.flyweight.in.FlyWeightIn;

/**
 * 管理多个User
 * 
 * @author renzhe.li
 *
 */
public class FlyWeightFactory {

	/** 保持多个享元对象 */
	private static HashMap<String, FlyWeightIn> hashMap = new HashMap<String, FlyWeightIn>();

	public static FlyWeightIn getFlyWeight(String key) {
		FlyWeightIn fw = hashMap.getOrDefault(key, null);
		/** 没有享元,则以共性内容去做为KEY */
		if (fw == null) {
			final User box = new User();
			final ConcreteFlyweight concreteFW = new ConcreteFlyweight(box);
			hashMap.put(key, concreteFW);

			fw = hashMap.get(key);
		}

		return fw;
	}
}
