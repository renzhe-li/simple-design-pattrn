package com.rzli.design.pattrn.iterator.im;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class MyIterator<E> implements Iterator<E> {

	private List<E> collection;
	private int pos = -1;

	public MyIterator(Collection<E> collection) {
		this.collection = collection.stream().collect(Collectors.toList());
	}

	@Override
	public boolean hasNext() {
		if (collection == null || collection.isEmpty()) {
			return false;
		}

		if (collection.size() <= (pos + 1)) {
			return false;
		}
		return true;
	}

	@Override
	public E next() {
		if (hasNext()) {
			pos++;
			return collection.get(pos);

		}
		return null;
	}

}
