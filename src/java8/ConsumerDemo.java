package java8;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<String> consumer = (String Str) -> System.out.println(Str);
		
		consumer.accept("Bench");

	}

}
