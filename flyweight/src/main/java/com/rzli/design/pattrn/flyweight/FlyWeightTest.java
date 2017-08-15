package com.rzli.design.pattrn.flyweight;

import com.rzli.design.pattrn.flyweight.dto.User;
import com.rzli.design.pattrn.flyweight.factory.FlyWeightFactory;
import com.rzli.design.pattrn.flyweight.in.FlyWeightIn;

public class FlyWeightTest {

	public static void main(String[] args) {
		final FlyWeightIn userContainer1 = FlyWeightFactory.getFlyWeight("User");
		final User user1 = userContainer1.operation();
		user1.setId(0L);
		user1.setUsername("@renzhe.li");
		System.out.println(user1);

		final FlyWeightIn userContainer2 = FlyWeightFactory.getFlyWeight("User");
		final User user2 = userContainer2.operation();
		user2.setId(1L);
		System.out.println(user2);

		System.out.println(user1 == user2);
	}
}
