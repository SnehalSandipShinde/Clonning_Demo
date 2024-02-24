package org.tnt.clonning.copy_constructor;

public class Employee {
	String name;
	final Integer age;
	Integer rollNum;
	
	public Employee(String name, Integer age, Integer rollNum) {
		super();
		this.name = name;
		this.age = age;
		this.rollNum = rollNum;
	}

	public Employee(Employee emp) {
		this.name = emp.name;
		this.age = emp.age;
		this.rollNum = emp.rollNum;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", rollNum=" + rollNum + "]";
	}

	public static void main(String[] args) {
		Employee employee = new Employee("snehal",25,01);
		
		System.out.println(employee);
		//passing the existing object in the copy constructor as an argument,
		Employee empl1 = new Employee(employee);
		
		System.out.println(empl1);
	}
}
