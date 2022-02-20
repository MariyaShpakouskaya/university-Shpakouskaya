package com.belhard.university;

import com.belhard.university.datastructures.*;
import com.belhard.university.exceptions.*;

public class Group implements Identifiable {
	private static long counter = 0;
	private long id;
	private int number;
	private Teacher teacher;
	private final MethodList<Student> students = new MyDynamicArray<>();
	private int maxNumberOfStudents = 8;

	public Group() {
		id = ++counter;
	}

	public boolean addStudent(Student student) {
		if (students.size() < maxNumberOfStudents) {
			students.add(student);
			return true;
		} else
			try {
				throw new RuntimeException();
			} catch (Exception e) {
				System.out.println("Group is full. Student not added. Program is already continued.");
			}
		return false;
	}

	public boolean removeStudent(Student student) {
		return students.remove(student);
	}

	public boolean containsStudent(Student student) {
		return students.contains(student);
	}

	public String getStudent(int index) {
		Student student = (Student) students.get(index);
		String list = student.toString() + "\n";
		return list;
	}

	public String getList() {
		String list = "<<<<<<<  Group is number " + number + "  >>>>>>>\n";
		list += "Teacher: ";
		if (teacher != null) {
			list += teacher.toString() + "\n";
		} else {
			list += "NOT APPOINTED\n";
		}
		list += "Students:\n";
		Object[] array = students.toArray();
		for (int i = 0; i < array.length; i++) {
			Student student = (Student) array[i];
			list += (i + 1) + student.toString();
		}
		list += "\n\tGrade Point Average of group is " + gradePointAverageOfStudents(array) + "\n";
		return list;
	}

	private double gradePointAverageOfStudents(Object[] array) {
		double totalGradePoint = 0;
		for (int i = 0; i < array.length; i++) {
			Student student = (Student) array[i];
			if (student == null) {
				break;
			}
			totalGradePoint += student.getGradePointAverage();
		}
		double gradePointAverage = totalGradePoint / students.size();
		return gradePointAverage;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
		if (number <= 0)
			throw new NegativeNumberException("Number of group is not be negative or 0. The programm is stopped.");
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		int numberOfFreePlaces = maxNumberOfStudents - students.size();
		return getList() + "\tNumber of Students: " + students.size() + "\n" + "\tFree places in the group: "
				+ numberOfFreePlaces + "\n";
	}

}
