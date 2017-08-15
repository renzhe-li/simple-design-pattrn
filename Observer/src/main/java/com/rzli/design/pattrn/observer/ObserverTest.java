package com.rzli.design.pattrn.observer;

import com.rzli.design.pattrn.observer.impl.MySubject;
import com.rzli.design.pattrn.observer.impl.Observer1;
import com.rzli.design.pattrn.observer.impl.Observer2;
import com.rzli.design.pattrn.observer.in.Subject;

/**
 * http://www.cnblogs.com/maowang1991/archive/2013/04/15/3023236.html
 * 
 * 观察者模式（Observer）<br>
 * 
 * 当一个对象变化时，其它依赖该对象的对象都会收到通知，并且随着变化！对象之间是一种一对多的关系
 * 
 * @author renzhe.li
 *
 */
public class ObserverTest {

	public static void main(String[] args) {

		Subject sub = new MySubject();
		sub.add(new Observer1());
		sub.add(new Observer2());

		sub.operation();
	}
}
