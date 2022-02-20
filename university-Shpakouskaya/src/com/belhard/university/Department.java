package com.belhard.university;

import com.belhard.university.datastructures.*;

public class Department implements Identifiable {
	private static long counter = 0;
	private long id;
	private NameOfDepartment name;
	private Teacher headOfDepartment;
	private Teacher deputyHeadOfDepartment;
	private Cleaner cleaner;
	private final MethodList<Teacher> teachers = new MyDynamicArray<>();
	private int maxNumberOfTeacher = 8;

	public Department() {
		id = ++counter;
	}

	@Override
	public long getId() {
		return id;
	}

	public boolean addTeacher(Teacher teacher) {
		if (teachers.size() < maxNumberOfTeacher) {
			teachers.add(teacher);
			return true;
		} else {
			try {
				throw new RuntimeException();
			} catch (Exception e) {
				System.out.println("Department is full. Teacher not added. Program is already continued.");
			}
			return false;
		}
	}

	public boolean removeTeacher(Teacher teacher) {
		return teachers.remove(teacher);
	}

	public boolean containsTeacher(Teacher teacher) {
		return teachers.contains(teacher);
	}

	public String getTeacher(int index) {
		Teacher teacher = (Teacher) teachers.get(index);
		String list = teacher.toString() + "\n";
		return list;
	}

	public String getList() {
		String list = "<<<<<<<  Department of " + getName() + "  >>>>>>>\n";
		list += "Head of Department: ";
		if (headOfDepartment != null) {
			list += headOfDepartment.toString();
		} else {
			list += "NOT APPOINTED\n";
		}
		list += "Deputy head of Department: ";
		if (deputyHeadOfDepartment != null) {
			list += deputyHeadOfDepartment.toString();
		} else {
			list += "NOT APPOINTED\n";
		}
		list += "Teachers of Department:\n";
		Object[] array = teachers.toArray();
		for (int i = 0; i < array.length; i++) {
			Teacher teacher = (Teacher) array[i];
			list += (i + 1) + ". " + teacher.toString();
		}

		list += "Cleaner: ";
		if (cleaner != null) {
			list += cleaner.toString() + ".\n";
		} else {
			list += "NOT APPOINTED\n";
		}
		return list;
	}

	public Teacher getHeadOfDepartment() {
		return headOfDepartment;
	}

	public void setHeadOfDepartment(Teacher headOfDepartment) {
		this.headOfDepartment = headOfDepartment;
	}

	public Teacher getDeputyHeadOfDepartment() {
		return deputyHeadOfDepartment;
	}

	public void setDeputyHeadOfDepartment(Teacher deputyHeadOfDepartment) {
		this.deputyHeadOfDepartment = deputyHeadOfDepartment;
	}

	public Cleaner getCleaner() {
		return cleaner;
	}

	public void setCleaner(Cleaner cleaner) {
		this.cleaner = cleaner;
	}

	public NameOfDepartment getName() {
		return name;
	}

	public void setName(NameOfDepartment name) {
		this.name = name;
	}

	@Override
	public String toString() {
		int numberOfFreePlaces = maxNumberOfTeacher - teachers.size();
		return getList() + "\tNumber of teachers: " + teachers.size() + "\n" + "\tFree places in the department: "
				+ numberOfFreePlaces + "\n";
	}

}
