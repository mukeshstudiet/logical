public class Fibbonaci {
	static int a=0;
	private static int fibbo(int n){
		if(n==0)
			return 0;
		else if (n==1)
			return 1;
		a = fibbo(n-1)+fibbo(n-2);
		return a;

	}

	public static void main(String args[]){
		int n=10;
		int i =-1;
		while(i<n){
			i++;	
			System.out.print(fibbo(i)+"  ");

		}
	}
}
