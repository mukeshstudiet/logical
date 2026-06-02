
public class Co_VarientReturn {
	/*as of Java 5, you're allowed to change the return type in the
	overriding method as long as the new return type is a SUBTYPE of the declared return
	type of the overridden (superclass) method.
	Let's look at a co-variant return in action:*/
	
	class Alpha {
	Alpha doStuff(char c) {
	return new Alpha();
	}
	}
	class Beta extends Alpha {
	
	@Override
    // Mind the subtpye return by overridden method
	
	Beta doStuff(char c) { // legal override in Java 1.5 
	return new Beta();
	}
	}
}
