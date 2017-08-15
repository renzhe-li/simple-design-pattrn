package com.rzli.design.pattrn.iterator;

import java.util.Collection;
import java.util.Iterator;

import com.rzli.design.pattrn.iterator.im.MyCollection;

/**
 * http://www.cnblogs.com/maowang1991/archive/2013/04/15/3023236.html
 * 
 * 迭代子模式（Iterator）
 * 
 * 代器模式就是顺序访问聚集中的对象. <br>
 * 一是需要遍历的对象，即聚集对象 <br>
 * 二是迭代器对象，用于对聚集对象进行遍历访问 <br>
 * 
 * @author renzhe.li
 *
 */
public class IteratorTest {

	public static void main(String[] args) {
		Collection collection = new MyCollection();
		Iterator it = collection.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
