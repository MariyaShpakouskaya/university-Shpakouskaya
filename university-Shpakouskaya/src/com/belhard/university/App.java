package com.belhard.university;

public class App {

	public static void main(String[] args) {
		Student st1 = new Student("Liza", "Ivanova", 9.5);
		Student st2 = new Student("Nickolay", "Zeruga", 8.1);
		Student st3 = new Student("Natalia", "Yereshyk", 7.3);
		Student st4 = new Student("Viktor", "Filipov", 6.7);
		Student st5 = new Student("Dmitriy", "Filipov", 9.8);
		Student st6 = new Student("Ekaterina", "Gavriluk", 8.4);
		Student st7 = new Student("Ivan", "Solncev", 6.2);
		Student st8 = new Student("Igor", "Solovey", 8.0);
		Student st9 = new Student("Sam", "Dermin", 7.9);
		Student st10 = new Student("Filiph", "Korotkov", 8.5);

		Teacher th1 = new Teacher("Oleg", "Demiday", 3);
		Teacher th2 = new Teacher("Nikita", "Parfenov", 2);

		Group group = new Group();
		group.setNumber(36);
		group.setTeacher(th1);
		group.addStudent(st1);
		group.addStudent(st2);
		group.addStudent(st3);
		group.addStudent(st4);
		group.addStudent(st5);
		group.addStudent(st6);
		group.addStudent(st7);
		group.addStudent(st8);

		System.out.println(group.getList());

		group.removeStudent(st4);
		group.removeStudent(st6);

		System.out.println("\tREMOVED STUDENT 4 AND 6:\n" + group.getList());

		group.addStudent(st9);
		group.addStudent(st10);

		System.out.println("\tADDED NEW STUDENTS:\n" + group.getList());

		group.setTeacher(th2);

		System.out.println("\tAPPOINTED NEW TEACHER:\n" + group.getList());

	}

}
