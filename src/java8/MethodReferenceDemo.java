package java8;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodReferenceDemo {

	public static void main(String[] args) {
		
		//Function<Integer, Double> function = (input) -> Math.sqrt(input);
		Function<Integer, Double> function = Math::sqrt;
		BiFunction<Integer, Integer, Integer> biFunction = Math::min;
		
		System.out.println(function.apply(64));
		System.out.println(biFunction.apply(22, 23));

	}

}
