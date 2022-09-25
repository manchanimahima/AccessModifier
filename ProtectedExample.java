package accessModifiers;

public class ProtectedExample {

	public static void main(String[] args) {
		
		ProtectedExample pe =new ProtectedExample();
		pe.add();
		
	}
	
	protected ProtectedExample() {
		System.out.println("I am constructor in Protected class");
	}
	protected void add() {
		System.out.println("Addition in Protected method");
	}

}
