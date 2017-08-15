package com.rzli.design.pattrn.prototype;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rzli.design.pattrn.prototype.dto.Professor;
import com.rzli.design.pattrn.prototype.dto.Student;

public class PrototypeTest {

	private static final Logger LOG = LoggerFactory.getLogger(PrototypeTest.class);

	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, IOException {

		final PrototypeTest prototypeTest = new PrototypeTest();
		prototypeTest.testObjectClone();
		prototypeTest.testDeepClone();
		prototypeTest.testDeepCloneWithSerialization();
	}

	public void testObjectClone() throws CloneNotSupportedException {
		final Professor professor = new Professor();
		professor.setName("Professor Name");
		professor.setSubject("Computer Science");

		final Student src = new Student();
		src.setProfessor(professor);
		src.setName("Student Name");
		src.setSubject("Computer Science");

		final Student des = (Student) src.clone();

		des.setName("Any Student Name");
		des.getProfessor().setName("Any Professor Name");

		LOG.debug("ObjectClone des : {}", des);
		LOG.debug("ObjectClone src : {}", src);
	}

	public void testDeepClone() throws CloneNotSupportedException {
		final Professor professor = new Professor();
		professor.setName("Professor Name");
		professor.setSubject("Computer Science");

		final Student src = new Student();
		src.setProfessor(professor);
		src.setName("Student Name");
		src.setSubject("Computer Science");

		final Student des = (Student) src.deepClone();

		des.setName("Any Student Name");
		des.getProfessor().setName("Any Professor Name");

		LOG.debug("DeepClone des : {}", des);
		LOG.debug("DeepClone src : {}", src);
	}

	public void testDeepCloneWithSerialization() throws ClassNotFoundException, IOException {
		final Professor professor = new Professor();
		professor.setName("Professor Name");
		professor.setSubject("Computer Science");

		final Student src = new Student();
		src.setProfessor(professor);
		src.setName("Student Name");
		src.setSubject("Computer Science");

		final Student des = (Student) src.deepCloneWithSerialization();

		des.setName("Any Student Name");
		des.getProfessor().setName("Any Professor Name");

		LOG.debug("DeepCloneWithSerialization des : {}", des);
		LOG.debug("DeepCloneWithSerialization src : {}", src);
	}

}
