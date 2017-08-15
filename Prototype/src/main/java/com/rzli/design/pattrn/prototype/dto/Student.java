package com.rzli.design.pattrn.prototype.dto;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Cloneable, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name;
	private String subject;
	private Professor professor;

	/**
	 * 浅拷贝，professor是同一个
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	/**
	 * 深拷贝，professor是不同的
	 * 
	 * @return
	 * @throws CloneNotSupportedException
	 */
	public Object deepClone() throws CloneNotSupportedException {
		final Student newInstance = (Student) super.clone();
		newInstance.professor = (Professor) professor.clone();

		return newInstance;
	}

	/**
	 * 
	 * 深拷贝 - 对象串行化
	 * 
	 * @return
	 * @throws CloneNotSupportedException
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public Object deepCloneWithSerialization() throws IOException, ClassNotFoundException {
		final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		final ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);

		objectOutputStream.writeObject(this);

		final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
		final ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);

		return objectInputStream.readObject();
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", subject=" + subject + ", professor=" + professor + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

}
