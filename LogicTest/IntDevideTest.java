import java.util.*;
public class IntDevideTest {
	private final int i;
	public IntDevideTest(int i) {
		this.i=i;
	}

	public static void main(String[] args) {
		
		// + operator is overloaded ONLY for STRING Objects, 
		//no other operator is overloaded for strings. so following will give compile error.
		
		//as of 22Jan2020 With Java 8 + operator is overloaded for int also.		
		
		System.out.println("  ##result " +2+7);
		System.out.println("   ##result " +7/2+7);
		System.out.println("   ##result " +(7/2+7));
		
        //System.out.println("1 << 30    ##result " + 1 << 30);
		// use () to make it work.
		System.out.println("1 << 30    ##result " + (1 << 30));
		
		List abc= new ArrayList();
	}
	
}
