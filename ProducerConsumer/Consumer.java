package ProducerConsumer;

public class Consumer implements Runnable{
	
Content sharedResource; 
private int i = 0;

public Consumer(Content resource){
	sharedResource = resource;
}

public void run(){
	while(true) {
		try {
			sharedResource.consume();
			i++;
		} catch (InterruptedException e) {
			System.out.println(" Consumer thread Interrupted");
		}
		if(i == 20 )
			break;

		}
	}
}
