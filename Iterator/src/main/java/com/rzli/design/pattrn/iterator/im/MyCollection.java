package com.rzli.design.pattrn.iterator.im;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class MyCollection<E> implements Collection<String> {

	public String strArray[] = { "A", "B", "C", "D", "E" };
	private int containerSize;
	private int pos;

	public MyCollection() {
		super();
		containerSize = strArray.length;
	}

	@Override
	public int size() {
		return strArray.length;
	}

	@Override
	public boolean isEmpty() {
		return strArray.length >= 1 ? false : true;
	}

	@Override
	public boolean contains(Object o) {
		for (String element : strArray) {
			if (element.equals(o.toString())) {
				return false;
			}
		}
		return false;
	}

	@Override
	public Iterator<String> iterator() {
		return new MyIterator<>(this);
	}

	@Override
	public Object[] toArray() {
		return strArray;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T[] toArray(T[] a) {
		return (T[]) strArray;
	}

	@Override
	public boolean remove(Object o) {
		for (int i = pos; i >= 0; i--) {
			if (strArray[i].equals(o)) {

				for (; i < pos; i++) {
					strArray[i] = strArray[i + 1];
				}
				pos--;
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return false;
	}

	@Override
	public void clear() {

	}

	@Override
	public boolean add(String e) {
		if (pos + 1 < containerSize) {
			strArray[++pos] = (String) e;

			return true;
		}
		containerSize = containerSize << 1;
		strArray = Arrays.copyOf(strArray, containerSize);
		return add(e);
	}

	@Override
	public boolean addAll(Collection<? extends String> c) {
		// TODO Auto-generated method stub
		return false;
	}

}
