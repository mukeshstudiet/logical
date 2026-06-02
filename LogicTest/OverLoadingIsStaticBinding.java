
class Animal { }
class Horse extends Animal { }
class OverLoadingIsStaticBinding {
	public void doStuff(Animal a) {
		System.out.println("In the Animal version");
	}
	public void doStuff(Horse h) {
		System.out.println("In the Horse version");
	}
	public static void main (String [] args) {
		OverLoadingIsStaticBinding ua = new OverLoadingIsStaticBinding();
		Animal animalObj = new Animal();
		Horse horseObj = new Horse();


		ua.doStuff(animalObj);
		ua.doStuff(horseObj);

		//But what if you use an Animal reference to a Horse object?
		
		Animal animalRefToHorse = new Horse();
		ua.doStuff(animalRefToHorse);

		/*Which of the overloaded versions is invoked? You might want to say, "The one
that takes a Horse, since it's a Horse object at runtime that's being passed to the
method." But that's not how it works. The preceding code would actually print:

"in the Animal version"

Even though the actual object at runtime is a Horse and not an Animal, the
choice of which overloaded method to call (in other words, the signature of the
method) is NOT dynamically decided at runtime. Just remember, the reference
type (not the object type) determines which overloaded method is invoked! To
summarize, which overridden version of the method to call (in other words, from
which class in the inheritance tree) is decided at runtime based on object type, but
which overloaded version of the method to call is based on the reference type of
the argument passed at compile time. If you invoke a method passing it an Animal
reference to a Horse object, the compiler knows only about the Animal, so it
chooses the overloaded version of the method that takes an Animal. It does not
matter that at runtime there's actually a Horse being passed.*/
	}
}
