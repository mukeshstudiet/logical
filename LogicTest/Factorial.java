package LogicTest;

public class Factorial {

	private int tillN;

	Factorial(int tillN){
		this.tillN=tillN;
	}
	private int getN() {return tillN;}
	private long calculateFactorial(int n){
		if(n==0)
			return 1;
		return n*calculateFactorial(n-1);

	}

	public static void main(String args[]){
		Factorial obj= new Factorial(4);
		System.out.printf("Factorial of "+ obj.getN()+ " is ");
		long fact=obj.calculateFactorial(obj.getN());
		System.out.println(fact);

	}
}
