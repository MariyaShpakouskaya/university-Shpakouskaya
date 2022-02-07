package com.belhard.university;

public class Department {
	private String nameOfDepartment;
	private Teacher headOfDepartment;
	private Teacher deputyHeadOfDepartment;
	private Cleaner cleaner;
	private final Teacher[] teachers = new Teacher[8];
	private int numberOfTeachers;

	public boolean addTeacher(Teacher teacher) {
		if (numberOfTeachers < teachers.length) {
			teachers[numberOfTeachers++] = teacher;
			return true;
		}
		return false;
	}

	public boolean dismissTeacher(Teacher teacher) {
		boolean dismiss = false;
		for (int i = 0; i < numberOfTeachers; i++) {
			Teacher elm = teachers[i];
			if (elm.getId() == teacher.getId()) {
				teachers[i] = null;
				dismiss = true;
			}
			if (dismiss == true) {
				if (i != numberOfTeachers - 1) {
					teachers[i] = teachers[i + 1];
				} else {
					teachers[i] = null;
				}
			}
		}
		if (dismiss) {
			numberOfTeachers--;
		}
		return dismiss;
	}

	public String getList() {
		String list = "<<<<<<<  Department of " + nameOfDepartment + "  >>>>>>>\n";
		list += "Head of Department: ";
		if (headOfDepartment != null) {
			list += "[id: " + headOfDepartment.getId() + "] " + headOfDepartment.getFirstName() + " "
					+ headOfDepartment.getLastName() + "\n";
		} else {
			list += "NOT APPOINTED\n";
		}
		list += "Deputy head of Department: ";
		if (deputyHeadOfDepartment != null) {
			list += "[id: " + deputyHeadOfDepartment.getId() + "] " + deputyHeadOfDepartment.getFirstName() + " "
					+ deputyHeadOfDepartment.getLastName() + "\n";
		} else {
			list += "NOT APPOINTED\n";
		}
		list += "Teachers of Department:\n";
		for (int i = 0; i < teachers.length; i++) {
			Teacher teacher = teachers[i];
			if (teacher == null) {
				break;
			}
			list += (i + 1) + ". [id:" + teacher.getId() + "] " + teacher.getFirstName() + " " + teacher.getLastName()
					+ "\n";
		}
		list += "Cleaner: ";
		if (cleaner != null) {
			list += "[id: " + cleaner.getId() + "] " + cleaner.getFirstName() + " " + cleaner.getLastName() + " "
					+ cleaner.getParlor() + "\n";
		} else {
			list += "NOT APPOINTED\n";
		}
		return list;
	}

	public String getNameOfDepartment() {
		return nameOfDepartment;
	}

	public void setNameOfDepartment(String nameOfDepartment) {
		this.nameOfDepartment = nameOfDepartment;
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

	public int getNumberOfTeachers() {
		return numberOfTeachers;
	}

	public void setNumberOfTeachers(int numberOfTeachers) {
		this.numberOfTeachers = numberOfTeachers;
	}

	@Override
	public String toString() {
		int numberOfFreePlaces = teachers.length - numberOfTeachers;
		return getList() + "\tNumber of teachers: " + numberOfTeachers + "\n" + "\tFree places in the department: "
				+ numberOfFreePlaces + "\n";
	}

}
