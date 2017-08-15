package com.rzli.design.pattrn.visitor;

import com.rzli.design.pattrn.visitor.impl.MySubject;
import com.rzli.design.pattrn.visitor.impl.MyVisitor;
import com.rzli.design.pattrn.visitor.in.Subject;
import com.rzli.design.pattrn.visitor.in.Visitor;

/**
 * 
 * http://www.cnblogs.com/maowang1991/archive/2013/04/15/3023236.html
 * 
 * 访问者模式（Visitor）<br>
 * 
 * 访问者模式把数据结构和作用于结构上的操作解耦合，使得操作集合可相对自由地演化。<br>
 * 访问者模式适用于数据结构相对稳定算法又易变化的系统。因为访问者模式使得算法操作增加变得容易。<br>
 * 访问者模式的优点是增加操作很容易，因为增加操作意味着增加新的访问者。<br>
 * 访问者模式将有关行为集中到一个访问者对象中，其改变不影响系统数据结构。<br>
 * 若系统数据结构对象易于变化，经常有新的数据对象增加进来，则不适合使用访问者模式。<br>
 * 其缺点就是增加新的数据结构很困难。
 * 
 * 
 * @author renzhe.li
 *
 */
public class VisitorTest {

	public static void main(String[] args) {

		Visitor visitor = new MyVisitor();
		Subject sub = new MySubject();
		sub.accept(visitor);
	}
}
