package java8;

public class MyFunctionalInterfaceDemo implements MyFunctionalInterface{
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyFunctionalInterface functionalInterface = (a,b) -> a+b;
		
		//functionalInterface.exeacute();
		
		System.out.println(" Result : "+functionalInterface.add(12, 20));
		

	}

	@Override
	public int add(int a, int b) {
		return a+b;
		
	}

}
