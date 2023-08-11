package java8;

import java.util.function.Consumer;

public class ConsumerImpl implements Consumer<String>{

	@Override
	public void accept(String input) {
		System.out.println(input);
		
	}

}


