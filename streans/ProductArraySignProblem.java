package src.streans;

public class ProductArraySignProblem {
    public static void main(String[] args) {

    }
        public int arraySign(int[] nums) {
//find 0
            if (Arrays.stream(nums).anyMatch(n -> n == 0)) {
                return 0;
            }
  // count values less than 0
            long negatives = Arrays.stream(nums)
                    .filter(n -> n < 0)
                    .count();

            return negatives % 2 == 0 ? 1 : -1;

    }


        public int arraySign(int[] nums) {

            int negativeCount = 0;

            for (int num : nums) {

                if (num == 0) {
                    return 0;
                }

                if (num < 0) {
                    negativeCount++;
                }
            }

            return negativeCount % 2 == 0 ? 1 : -1;
        }
}
