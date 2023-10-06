package org.tnt.clonning;

public class DeepCloningDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		Department department = new Department(123,"IT");

		Employee emp1 = new Employee(10, "Ram", department);

		Employee emp2 = (Employee) emp1.clone();

		System.out.println("emp1"+emp1);
		System.out.println("emp2"+emp2);
		
		emp1.getDepartment().setDeptName("HR");
		System.out.println("--------After-------");
		
		System.out.println("emp1"+emp1);
		System.out.println("emp2"+emp2);
		

	}
}
