package com.rzli.design.pattrn.flyweight.in;

import com.rzli.design.pattrn.flyweight.dto.User;

/**
 * 外部状态:可变的细粒度 <br>
 * 内部状态:提取出可变中不可变的细粒度
 * 
 * @author renzhe.li
 *
 */
public interface FlyWeightIn {
	User operation();
}
