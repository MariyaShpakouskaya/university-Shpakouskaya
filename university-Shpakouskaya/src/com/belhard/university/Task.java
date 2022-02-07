package com.belhard.university;

import java.math.BigDecimal;

import com.belhard.university.Money.Currency;

public class Task {

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

		Teacher th1 = new Teacher("Oleg", "Demiday", 1);
		th1.setSalary(new Money(Currency.BLR, BigDecimal.valueOf(900)));
		Teacher th2 = new Teacher("Nikita", "Parfenov", 3);
		th2.setSalary(new Money(Currency.BLR, BigDecimal.valueOf(1100)));
		Teacher th3 = new Teacher("Alexey", "Pilnov", 0);
		th3.setSalary(new Money(Currency.BLR, BigDecimal.valueOf(800)));
		Teacher th4 = new Teacher("Alex", "Nironov", 10);
		th4.setSalary(new Money(Currency.BLR, BigDecimal.valueOf(1500)));
		Teacher th5 = new Teacher("Mihail", "Kovrigin", 3);
		th5.setSalary(new Money(Currency.BLR, BigDecimal.valueOf(1100)));
		Teacher th6 = new Teacher("Leon", "Shakov", 6);
		th6.setSalary(new Money(Currency.BLR, BigDecimal.valueOf(1200)));
		Teacher th7 = new Teacher("Iosif", "Melkov", 4);
		th7.setSalary(new Money(Currency.BLR, BigDecimal.valueOf(1100)));

		Cleaner cl1 = new Cleaner("Natalia", "Ivanova", 3, "Parlor of Department and 1st floor");

		Group group = new Group();
		group.setNumber(23);
		group.addStudent(st1);
		group.addStudent(st2);
		group.addStudent(st3);
		group.addStudent(st4);
		group.addStudent(st5);
		group.addStudent(st6);
		group.addStudent(st7);
		group.addStudent(st8);
		group.setTeacher(th3);

		Department department = new Department();
		department.setNameOfDepartment("Applied Mathematics");
		department.addTeacher(th1);
		department.addTeacher(th2);
		department.addTeacher(th3);
		department.addTeacher(th5);
		department.setHeadOfDepartment(th4);
		department.setDeputyHeadOfDepartment(th6);
		department.setCleaner(cl1);

		System.out.println(group.getList());
		System.out.println(department.getList());

		group.removeStudent(st5);
		System.out.println("\tREMOVED STUDENT 5\n");
		System.out.println(group.toString());

		department.dismissTeacher(th2);
		System.out.println("\tDISMISS TEACHER 2\n" + department.getList());

		group.addStudent(st9);
		System.out.println("\tADDED NEW STUDENT:\n" + group.getList());

		department.addTeacher(th7);
		System.out.println("\tAPPOINTED NEW TEACHER ON DEPARTMENT:\n" + group.getList());

		Money salary = AccauntantUtil.countTotalSalary(new Employee[] { th1, th3, th4, th5, th6, th7, cl1 });
		System.out.println("Department staff salary is " + salary);

		department.setCleaner(null);
		System.out.println("\tDISMISS CLEANER \n" + department.getList());
		System.out.println(group.toString());
		System.out.println(department.toString());
	}

}
