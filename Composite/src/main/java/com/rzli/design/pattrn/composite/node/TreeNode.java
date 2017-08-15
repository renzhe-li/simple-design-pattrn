package com.rzli.design.pattrn.composite.node;

import java.util.Enumeration;
import java.util.Vector;

public class TreeNode {

	private String name;
	private TreeNode parent;
	private Vector<TreeNode> children = new Vector<TreeNode>();

	public TreeNode(String name) {
		this.name = name;
	}

	/**
	 * 添加孩子节点
	 * 
	 * @param node
	 */
	public void addChildren(TreeNode node) {
		children.add(node);
	}

	/**
	 * 删除孩子节点
	 * 
	 * @param node
	 */
	public void remove(TreeNode node) {
		children.remove(node);
	}

	/**
	 * 取得孩子节点
	 * 
	 * @return
	 */
	public Enumeration<TreeNode> getChildren() {
		return children.elements();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TreeNode getParent() {
		return parent;
	}

	public void setParent(TreeNode parent) {
		this.parent = parent;
	}

	public void setChildren(Vector<TreeNode> children) {
		this.children = children;
	}

	@Override
	public String toString() {
		return "TreeNode [name=" + name + ", parent=" + parent + ", children=" + children + "]";
	}

}
