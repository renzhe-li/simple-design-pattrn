package com.rzli.design.pattrn.composite;

import com.rzli.design.pattrn.composite.node.TreeNode;
import com.rzli.design.pattrn.composite.tree.Tree;

/**
 * http://www.cnblogs.com/maowang1991/archive/2013/04/15/3023236.html
 * 
 * 组合模式（Composite）<br>
 * 
 * 使用场景：将多个对象组合在一起进行操作，常用于表示树形结构中，例如二叉树，数等。
 * 
 * @author renzhe.li
 *
 */
public class CompositeTest {

	public static void main(String[] args) {
		final Tree tree = new Tree("A");

		final TreeNode nodeB = new TreeNode("B");
		final TreeNode nodeC = new TreeNode("C");

		nodeB.addChildren(nodeC);
		tree.root.addChildren(nodeB);

		System.out.println("build the tree finished!");
	}
}
