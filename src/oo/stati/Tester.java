package oo.stati;

public class Tester {

	public static void main(String[] args) {
		Student stu1 = new Student(85, 73, 90);
		Student stu2 = new Student(68, 84, 89);
		Student stu3 = new Student(75, 99, 59);
		stu1.pass = 100;
		stu1.print();
		stu2.print();
	}

}
