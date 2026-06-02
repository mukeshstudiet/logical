package src.ProducerConsumer;



import java.util.concurrent.*;

public class ProducerConsumerBlockingQueue {

    private static final BlockingQueue<Integer> queue =
            new ArrayBlockingQueue<>(5);

    public static void main(String[] args) throws Exception {

        try (ExecutorService executor =
                     Executors.newVirtualThreadPerTaskExecutor()) {

            executor.submit(() -> {
                for (int i = 1; i <= 20; i++) {
                    queue.put(i);
                    System.out.println("Produced: " + i);
                }

                queue.put(-1); // poison pill
                return null;
            });

            executor.submit(() -> {
                while (true) {
                    int item = queue.take();

                    if (item == -1) {
                        break;
                    }

                    System.out.println("Consumed: " + item);
                }

                return null;
            });
        }
    }
}

