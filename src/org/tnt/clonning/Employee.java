package org.tnt.clonning;

public class Employee implements Cloneable{

	int id;
	String name;
	Department department;

	public Employee() {
		super();
	}

	public Employee(int id, String name, Department department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
//		return super.clone();
		
		Employee cloned = (Employee) super.clone();
		cloned.setDepartment((Department)cloned.getDepartment().clone());
		return cloned;
	}

}
