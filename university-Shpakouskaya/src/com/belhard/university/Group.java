package com.belhard.university;

public class Group {
	private int number;
	private Teacher teacher;
	private final Student[] students = new Student[8];
	private int numberOfStudents;
	private double averageGradePointOfStudents;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public double getAverageGradePointOfStudents() {
		return averageGradePointOfStudents;
	}

	public void setAverageGradePointOfStudents(double averageGradePointOfStudents) {
		this.averageGradePointOfStudents = averageGradePointOfStudents;
	}

	public boolean addStudent(Student student) {
		if (numberOfStudents < students.length) {
			students[numberOfStudents++] = student;
			return true;
		}
		return false;
	}

	public boolean removeStudent(Student student) {
		boolean removed = false;
		for (int i = 0; i < numberOfStudents; i++) {
			Student elm = students[i];
			if (elm.getId() == student.getId()) {
				students[i] = null;
				removed = true;
			}
			if (removed == true) {
				if (i != numberOfStudents - 1) {
					students[i] = students[i + 1];
				} else {
					students[i] = null;
				}
			}
		}
		if (removed) {
			numberOfStudents--;
		}
		return removed;
	}

	public String getList() {
		String list = "<<<<<<<  Group is number " + number + "  >>>>>>>\n";
		list += "Teacher: ";
		if (teacher != null) {
			list += "[id: " + teacher.getId() + "] " + teacher.getFirstName() + " " + teacher.getLastName() + "\n";
		} else {
			list += "NOT APPOINTED\n";
		}
		list += "Students:\n";
		for (int i = 0; i < students.length; i++) {
			Student student = students[i];
			if (student == null) {
				break;
			}
			list += (i + 1) + ". [id:" + student.getId() + "] " + student.getFirstName() + " " + student.getLastName()
					+ " /average grade point: " + student.getAverageGradePoint() + "/ \n";
		}
		return list;
	}
}
