package practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> setDemo = new HashSet<String>();
		setDemo.add("raghav");
		setDemo.add("aarav");
		setDemo.add("shalini");
		setDemo.add("singh");
		setDemo.add("demmo");
		
		Iterator<String> it = setDemo.iterator();
		
		while(it.hasNext()){
			System.out.println("Using Iterator :" + it.next());
		}
			
		for(String str : setDemo) {
			System.out.println("For Each : "+ str);
		}
		
		setDemo.forEach(System.out::println);
		
		}
		
}
