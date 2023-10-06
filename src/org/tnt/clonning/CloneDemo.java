package org.tnt.clonning;

public class CloneDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1 = new Student(10, "Ram");
		Student s2 = new Student(10, "Ram");
		Student s3 = new Student(10, "Ram");
		Student s4 = (Student) s3.clone();
		Student s5 = s4;

		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1 == s4);
		System.out.println(s2 == s3);
		System.out.println(s4.equals(s3));

		System.out.println(s4 == s3);
		System.out.println(s4 == s5);

	}

}
