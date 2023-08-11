package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q1Demo {

	public static void main(String[] args) {
		List<String> G7 = Arrays.asList("USA","Japan","France","Germany","Italy","UK","Canada");
		
		String collect = G7.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(","));
		
		System.out.println(collect);
		
		List<Integer> intList = Arrays.asList(9,10,3,4,7,3,4);
		List<Integer> collect2 = intList.stream().map(i -> i*i).distinct().collect(Collectors.toList());
		
		System.out.println(collect2);
	}

}
