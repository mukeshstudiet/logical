
//Class for inter-thread co-ordination, using gaurded block,
// same can be used for traffic light system. 

public class OneTwo1212 {

	private int what2print=1;
	
	OneTwo1212(){
		System.out.println(" strat app");
	}

	private void printOne() {
		synchronized(this){
			while(what2print!=1){
				try { 
					wait();
				} catch (InterruptedException e) {}
			}
			System.out.println("STOP");
			what2print=2;
			try { 
				Thread.sleep(100);
				notifyAll();
			} catch (InterruptedException e) {}
		}

	}

	private void printTwo () {
		synchronized(this){
			while(what2print!=2){
				try { 
					wait();
				} catch (InterruptedException e) {}
			}		System.out.println("    Yellow ");
			what2print=3;
			try { 
				Thread.sleep(100);
				notifyAll();
			} catch (InterruptedException e) {}

		}

	}
	private void printThree () {
		synchronized(this){
			while(what2print!=3){
				try { 
					wait();
				} catch (InterruptedException e) {}
			}		System.out.println("          GREEN  ");
			what2print=1;
			try { 
				Thread.sleep(100);
				notifyAll();
			} catch (InterruptedException e) {}

		}

	}

	Thread one= new Thread(new Runnable() {
		public void run(){
			while(true){
				printOne();
			}
		}
	});
	Thread two = new Thread(new Runnable() {
		public void run(){
			while(true){
				printTwo();
			}
		}
	});

	Thread three = new Thread(new Runnable() {
		public void run(){
			while(true){
				printThree();
			}
		}
	});

	public void start(){
		one.start();
		two.start();
        three.start();
	}

	public static void main(String args[]){

		OneTwo1212 obj= new OneTwo1212();
		obj.start();
	}
}