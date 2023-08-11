package java8;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		String email = null ;
		//String email = null;
		
		String optionalEmail = Optional.ofNullable(email).orElse("test.gmail.com");
		System.out.println(optionalEmail);
		

		
		  Optional<String> emptyEmail = Optional.empty().ofNullable("Optional.empty()");
		  System.out.println(emptyEmail);
		  
		  String ofNullableException = Optional.ofNullable(email).orElseThrow(() -> new NullPointerException("This is optional demo"));
		  System.out.println(ofNullableException);
		 

	}

}
