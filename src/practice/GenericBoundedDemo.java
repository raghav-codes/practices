package practice;

public class GenericBoundedDemo<T extends Integer> {
	
	private T n;

	public GenericBoundedDemo(T n) {
		super();
		this.n = n;
	}

	public boolean isEven() {
		return n.intValue() % 2 == 0;
	}

	public static void main(String[] args) {
		GenericBoundedDemo genericBoundedDemo = new GenericBoundedDemo(2);
		
		System.out.println(genericBoundedDemo.isEven());
		
		
	}
}
