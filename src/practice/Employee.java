package practice;

public class Employee {
	private String name;
	private String empID;
	private Double salary;
	private String dept;
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empID=" + empID + ", salary=" + salary + ", dept=" + dept + "]";
	}

	public Employee(String name, String emmpID, Double salary, String dept) {
		super();
		this.name = name;
		this.empID = emmpID;
		this.salary = salary;
		this.dept = dept;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmpID() {
		return empID;
	}

	public void setEmmpID(String emmpID) {
		this.empID = emmpID;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

}
