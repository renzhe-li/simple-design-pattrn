package com.rzli.design.pattrn.composite.tree;

import com.rzli.design.pattrn.composite.node.TreeNode;

public class Tree {

	public TreeNode root = null;

	public Tree(String name) {
		super();
		this.root = new TreeNode(name);
	}

}
