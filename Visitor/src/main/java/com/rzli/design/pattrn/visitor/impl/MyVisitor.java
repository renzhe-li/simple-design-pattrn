package com.rzli.design.pattrn.visitor.impl;

import com.rzli.design.pattrn.visitor.in.Subject;
import com.rzli.design.pattrn.visitor.in.Visitor;

public class MyVisitor implements Visitor {

	@Override
	public void visit(Subject sub) {

		System.out.println("visit the subject：" + sub.getSubject());
	}

}
