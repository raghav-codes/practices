package practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo {

	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		Predicate<Integer> p1 = (x) -> x>5;
		Predicate<Integer> p2 = (x) -> x<8;
		
		list1.stream().filter(p1.and(p2)).collect(Collectors.toList()).forEach(System.out::println);


	}

}
