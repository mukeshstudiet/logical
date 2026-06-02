package ProducerConsumer;

public class Producer implements Runnable{
	
Content sharedResource; 
private int i = 0;

public Producer(Content resource){
	sharedResource = resource;
}

public void run(){
	while(true) {
		try {
			sharedResource.produce();
			i++;
		} catch (InterruptedException e) {
			System.out.println(" Consumer thread Interrupted");
		}
		if(i == 20 )
			break;
	}
}
}
