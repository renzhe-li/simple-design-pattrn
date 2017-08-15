package com.rzli.design.pattrn.visitor.in;

public interface Subject {

	public void accept(Visitor visitor);

	public String getSubject();

}
