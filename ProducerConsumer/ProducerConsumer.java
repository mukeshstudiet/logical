package ProducerConsumer;

public class ProducerConsumer{

public static void main(String args[]){
	
Content sharedResource = new Content(); 

Producer p = new Producer(sharedResource);
Consumer c = new Consumer(sharedResource);

Thread producerThread = new Thread(p);
Thread consumerThread = new Thread(c);
producerThread.start();
consumerThread.start();
}

}