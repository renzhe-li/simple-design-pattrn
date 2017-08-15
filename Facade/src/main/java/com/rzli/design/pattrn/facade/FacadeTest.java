package com.rzli.design.pattrn.facade;

import com.rzli.design.pattrn.facade.container.Computer;

/**
 * http://www.cnblogs.com/maowang1991/archive/2013/04/15/3023236.html
 * 
 * 外观模式（Facade）<br>
 * 
 * 外观模式是为了解决类与类之家的依赖关系的,外观模式就是将他们的关系放在一个Facade类中，降低了类类之间的耦合度
 * 
 * @author renzhe.li
 *
 */
public class FacadeTest {

	public static void main(String[] args) {

		Computer computer = new Computer();
		computer.startup();
		computer.shutdown();
	}

}
