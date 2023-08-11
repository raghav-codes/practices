package practice;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortDemo {
	
	public static void main(String[] args) {
		
		List<Employee> empList = List.of(new Employee("raghav","477105", 136200.00, "BCP"),
				new Employee("Pankaj","330105", 146200.00, "BIP"), 
				new Employee("Van","123105", 1456200.00, "BCP") );

	
	List<Employee> sortedEmpList = empList.stream().sorted(Comparator.comparing(Employee::getEmpID).thenComparing(Employee::getDept)).collect(Collectors.toList());
	
	//System.out.println("Original List : "+empList);

	System.out.println("Sorted List : "+ sortedEmpList);
	
	}

	
}
