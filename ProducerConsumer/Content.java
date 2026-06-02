package ProducerConsumer;

import java.util.LinkedList;
import java.util.Queue;

class Content {

	private Queue<Integer> jobQueue = new LinkedList<Integer>();

	public synchronized boolean produce() throws InterruptedException {
		try {
			if (jobQueue.size() > 0) {
				wait();
			} else {
				jobQueue.offer(new Integer(1));
				System.out.println(" Added content in queue " + 1 + "  Queue Size" + jobQueue.size());
			}
		} catch (InterruptedException e) {
			System.out.println(" Error occured while Producing");
			throw e;
		}
		notify();
		return true;
	}

	public synchronized Integer consume() throws InterruptedException {
		Integer value = null;
		try {
			if (jobQueue.size() == 0) {
				wait();
			} else {
				value = jobQueue.poll();
				System.out.println(" Removed content in queue " + value + "  Queue Size" + jobQueue.size());
			}
		} catch (InterruptedException e) {
			System.out.println(" Error occured while Consuming");
			throw e;
		}
		notify();
		return value;
	}
}