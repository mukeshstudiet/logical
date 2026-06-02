
public class DeadLock {
	
	private Object obj=new Object();
	private Object obj2=new Object();

	private void startThrads(){
		a.start();
		b.start();
	}
	
	Thread a = new Thread(new Runnable(){
		
		public void run() {
			
			synchronized(obj){
				System.out.println("lock 1 aquired by " + Thread.currentThread().getName());
				try{Thread.sleep(100);}
				catch(Exception ex){}
				synchronized (obj2) {
					System.out.println("lock 2 aquired by " + Thread.currentThread().getName());
				}
			
			}
		}
		
		
	}, "Thread 1");

	Thread b = new Thread(new Runnable(){
		
		public void run() {
			
			synchronized(obj2){
				System.out.println("lock 1 aquired by " + Thread.currentThread().getName());
				try{Thread.sleep(100);}
				catch(Exception ex){}
				synchronized (obj) {
					System.out.println("lock 2 aquired by " + Thread.currentThread().getName());
				}
			
			}
		}
		
		
	}, "Thread 2");
	



public static void main (String args[]){
	
DeadLock testobj = new DeadLock();
testobj.startThrads();

	
	
}	

}