interface abc {
	int i=10;
}

interface subtype extends abc {
	// i=10 in inside InterfaceTest is visible to interface subtype but 
	// as its static and final, subtype cant change its value.
	// if you override i as in following, base value will be hidden forever. 
	// as 'super' is not allowed inside Interfaces,
		//int j=super.i;
	int i=100;
	int j=i;

}

public class InterfaceTest implements subtype {
	public static void main(String args[]){
		System.out.println("I ka jadoo from base type j " + j);
	}
}


