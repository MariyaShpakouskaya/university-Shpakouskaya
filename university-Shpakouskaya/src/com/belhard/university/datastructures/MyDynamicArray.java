package com.belhard.university.datastructures;

public class MyDynamicArray<E> implements MethodList<E> {
	private Object[] object = new Object[10];
	private int size;

	public int size() {
		int counter = 0;
		for (int i = 0; i < object.length; i++) {
			if (object[i] == null) {
				break;
			}
			counter++;
		}
		return counter;
	}

	public void add(E obj) {
		if (size >= object.length) {
			Object[] objects = new Object[object.length * 2];
			for (int i = 0; i < size(); i++) {
				objects[i] = object[i];
			}
		}
		object[size++] = obj;
	}

	public boolean remove(Object obj) {
		boolean remove = false;
		for (int i = 0; i < size; i++) {
			Object elm = object[i];
			if (elm.equals(obj)) {
				object[i] = null;
				remove = true;
			}
			if (remove == true) {
				if (i != size - 1) {
					object[i] = object[i + 1];
				} else {
					object[i] = null;
				}
			}
		}
		if (remove) {
			size--;
		}
		return remove;
	}

	public boolean contains(Object obj) {
		boolean containObject = false;
		for (int i = 0; i < object.length; i++) {
			if (obj.equals(object[i])) {
				containObject = true;
				break;
			}
		}
		return containObject;
	}

	public E get(int index) {
		return (E) object[index];
	}

	public Object[] toArray() {
		Object[] array = new Object[size];
		for (int i = 0; i < size; i++) {
			if (object[i] == null) {
				break;
			}
			array[i] = object[i];
		}
		return array;
	}

}
