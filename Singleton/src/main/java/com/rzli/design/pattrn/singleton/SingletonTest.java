package com.rzli.design.pattrn.singleton;

/**
 * http://www.cnblogs.com/maowang1991/archive/2013/04/15/3023236.html
 * 
 * 单例模式(Singleton) <br>
 * 描述：保证在一个JVM中，同一对象只有一个实例存在 <br>
 * 优点：1.某些类创建比较频繁，对于一些大型的对象，这是一笔很大的系统开销 <br>
 * 2.省去了new操作符，降低了系统内存的使用频率，减轻GC压力 <br>
 * 3.有些类如交易所的核心交易引擎，控制着交易流程，如果该类可以创建多个的话，系统完全乱了。（比如一个军队出现了多个司令员同时指挥，肯定会乱成一团），所以只有使用单例模式，才能保证核心交易服务器独立控制整个流程。
 * 
 * @author renzhe.li
 *
 */
public class SingletonTest {

	public static void main(String[] args) {

	}
}
