
	public abstract class AbstractTest {
		private String type;
		public abstract void goUpHill(); // Abstract method
		public String getType() { // Non-abstract method
		return type;
		}
		
		public abstract class Car extends AbstractTest {
		// If you don't provide definition of any of the method of abstract base class/interface,
		// Then YOU will have to mark sub class as abstract, this makes sense, 
		// because, you haven't overridden a base method, which is abstract,
		//so same will part of sub class also,which makes sub class a abstract class.  
			
			//public abstract void goUpHill(); // Still abstract
			
			public void doCarThings() {
		// special car code goes here
		}
		}
	}
