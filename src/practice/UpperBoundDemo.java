package practice;

import java.util.Arrays;
import java.util.List;

public class UpperBoundDemo {
	
	public static double sumOfList(List<? extends Number > List){
		 Double sum = 0.0;

		for ( Number n : List){
		sum += n.doubleValue();
		
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		
		System.out.println("Sum of int:" +sumOfList(Arrays.asList(1,2,3)));
		System.out.println("Sum of Double :" +sumOfList(Arrays.asList(1.2,2.3,3.4)));
	}

}
