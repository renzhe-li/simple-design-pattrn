package com.rzli.design.pattrn.singleton.instance;

public class Singleton {

	/** 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
	private static Singleton instance = null;

	private Singleton() {
	}

	/**
	 * 
	 * @return instance
	 */
	public Object readResolve() {
		return instance;
	}

	/**
	 * 静态工程方法，创建实例 <br>
	 * 
	 * a>A、B线程同时进入了第一个if判断 <br>
	 * b>A首先进入synchronized块，由于instance为null，执行instance = new Singleton(); <br>
	 * c>由于JVM内部的优化机制，JVM先画出了一些分配给Singleton实例的空白内存，并赋值给instance成员（注意此时JVM没有开始初始化这个实例），
	 * <tab>然后A离开了synchronized块。
	 * d>B进入synchronized块，由于instance此时不是null，马上离开了synchronized块并将结果返回给调用该方法的程序。<br>
	 * e>此时B线程打算使用Singleton实例，却发现它没有被初始化，于是错误发生了。 <br>
	 * 
	 * @return instance
	 */
	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (instance) {
				instance = new Singleton();
			}
		}

		return instance;
	}

	/**
	 * 单例模式使用内部类来维护单例的实现 <br>
	 * JVM内部的机制能够保证当一个类被加载的时候，这个类的加载过程是线程互斥的。
	 * 这样当我们第一次调用getInstance的时候，JVM能够帮我们保证instance只被创建一次，并且会保证把赋值给instance的内存初始化完毕。
	 * 同时该方法也只会在第一次调用的时候使用互斥机制，这样就解决了低性能问题。
	 * 
	 * @return
	 */
	public static Singleton getInstanceWithInsideClass() {

		return SingletonFactory.instance;
	}

	private static final class SingletonFactory {

		private static final Singleton instance = new Singleton();
	}

	public static void setInstance(Singleton instance) {
		Singleton.instance = instance;
	}

}
