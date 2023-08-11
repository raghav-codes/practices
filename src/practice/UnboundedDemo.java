package practice;

import java.util.Arrays;
import java.util.List;

public class UnboundedDemo {
	
	public static void printList(List<?> list) {
		for ( Object obj : list) {
			System.out.println("Element : " + obj);
			
		}
		System.out.println();
	}

	
	public static void main(String[] args) {
		printList(Arrays.asList(1,2,3,6.0,"demo"));
		printList(Arrays.asList(1.2, 2.3,3.4));
	}
	
}
