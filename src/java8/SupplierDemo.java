package java8;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierDemo implements Supplier<LocalDateTime> {

	public static void main(String[] args) {
		
		Supplier supplierdemo = () -> LocalDateTime.now();
		
		
		System.out.println(supplierdemo.get());
	}

	@Override
	public LocalDateTime get() {
		// TODO Auto-generated method stub
	 return LocalDateTime.now();
	}

	/*
	 * @Override public T get() { // TODO Auto-generated method stub return
	 * LocalDateTime.now(); }
	 */

}
