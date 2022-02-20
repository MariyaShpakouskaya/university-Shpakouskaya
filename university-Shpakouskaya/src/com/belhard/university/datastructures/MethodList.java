package com.belhard.university.datastructures;

public interface MethodList<E> {

	int size();

	void add(E obj);

	boolean remove(Object obj);

	boolean contains(Object obj);

	E get(int index);

	Object[] toArray();
}
