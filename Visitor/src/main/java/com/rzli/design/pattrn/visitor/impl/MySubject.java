package com.rzli.design.pattrn.visitor.impl;

import com.rzli.design.pattrn.visitor.in.Subject;
import com.rzli.design.pattrn.visitor.in.Visitor;

public class MySubject implements Subject {

	@Override
	public void accept(Visitor visitor) {

		visitor.visit(this);
	}

	@Override
	public String getSubject() {

		return "love";
	}

}
