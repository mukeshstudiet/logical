import java.util.stream.IntStream;

public class Q20_ParallelStreams {
    public static void main(String[] args) {
        int result = IntStream.rangeClosed(1, 1_000_000)
                .parallel()
                .sum();

        System.out.println("Parallel sum: " + result);
    }
}
