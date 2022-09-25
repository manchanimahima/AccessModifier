package accessModifiers;

public class privateExample {

	public static void main(String[] args) {

		privateExample pe = new privateExample();
		pe.printPrivate();

	}

	
	private void printPrivate() {
		System.out.println("Print the private message");
	}
}
