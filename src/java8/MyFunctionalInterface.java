package java8;

import java.io.PrintWriter;

@FunctionalInterface
public interface MyFunctionalInterface {
	
	public int add(int a, int b);
	
	public default void print( String text) {
		System.out.print(text);
	}
	
	public static void print(String text, PrintWriter writer) {
		writer.write(text);
	}

}
