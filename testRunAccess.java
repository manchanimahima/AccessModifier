package accessModifiers;

public class testRunAccess {

	public static void main(String[] args) {
		
		ProtectedExample pe =new ProtectedExample();
		pe.add();

		defaultExample de = new defaultExample();
		de.defaultprint();
		
		//privateExample pe = new privateExample();
	//	pe.printPrivate();  //cannot be called this function as it is private
		
		
	}

}
