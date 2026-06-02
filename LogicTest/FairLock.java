
import java.util.ArrayList;
import java.util.List;

/* Just a normal Representation of Lock class */

class Lock{
	  private boolean isLocked      = false;
	  private Thread  lockingThread = null;

	  public synchronized void lock() throws InterruptedException{
	    while(isLocked){
	      wait();
	    }
	    isLocked      = true;
	    lockingThread = Thread.currentThread();
	  }

	  public synchronized void unlock(){
	    if(this.lockingThread != Thread.currentThread()){
	      throw new IllegalMonitorStateException(
	        "Calling thread has not locked this lock");
	    }
	    isLocked      = false;
	    lockingThread = null;
	    notify();
	  }
	}

class Synchronizer{
  // Lock lock = new Lock(); Normal locking 
  FairLock lock = new FairLock(); //Fair Locking

  public void doSynchronized() throws InterruptedException{
    this.lock.lock();
      //critical section, do a lot of work which takes a long time
    this.lock.unlock();
  }

}
public class FairLock {
    private boolean           isLocked       = false;
    private Thread            lockingThread  = null;
    private List<QueueObject> waitingThreads =
            new ArrayList<QueueObject>();

  public void lock() throws InterruptedException{
    QueueObject queueObject           = new QueueObject();
    boolean     isLockedForThisThread = true;
    synchronized(this){
        waitingThreads.add(queueObject);
    }

    while(isLockedForThisThread){
      synchronized(this){
        isLockedForThisThread =
            isLocked || waitingThreads.get(0) != queueObject;
        if(!isLockedForThisThread){
          isLocked = true;
           waitingThreads.remove(queueObject);
           lockingThread = Thread.currentThread();
           return;
         }
      }
      try{
        queueObject.doWait();
      }catch(InterruptedException e){
        synchronized(this) { waitingThreads.remove(queueObject); }
        throw e;
      }
    }
  }

  public synchronized void unlock(){
    if(this.lockingThread != Thread.currentThread()){
      throw new IllegalMonitorStateException(
        "Calling thread has not locked this lock");
    }
    isLocked      = false;
    lockingThread = null;
    if(waitingThreads.size() > 0){
      waitingThreads.get(0).doNotify();
    }
  }
}


class QueueObject {

	  private boolean isNotified = false;

	  public synchronized void doWait() throws InterruptedException {
	    while(!isNotified){
	        this.wait();
	    }
	    this.isNotified = false;
	  }

	  public synchronized void doNotify() {
	    this.isNotified = true;
	    this.notify();
	  }

	  public boolean equals(Object o) {
	    return this == o;
	  }
	}
