package src;

import java.util.ArrayList;
import java.util.HashMap;
/*Array A contains n integers. A pair (i,j) of indexes of the array A is called "K-complementary" if A[i]+A[j] = K. For example, given the array:

A[0]=1 A[1]=8 A[2]=-3 A[3]=0 A[4]=1 A[5]=3 A[6]=-2A[7]=4 A[8]=5
The following pairs are 6-complementary: (0,8) (1,6) (4,8) (5,5) (6,1) (8,0) (8,4) For example the pair (4,8) is 6-complementary, because A[4]+A[8] = 1 + 5 = 6.
Write a function

int complementary_pairs(int k,int[] A);
which given an integer K and an array A of n integers, computes the number of K-complimentary pairs of indexes of the array A. For example for array A:

A[0]=1 A[1]=8 A[2]=-3 A[3]=0 A[4]=1 A[5]=3 A[6]=-2A[7]=4 A[8]=5 and K=6 you should return 7
 * 
 *
 * */

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class KComplementary {

    public static void main(String[] args) {

        int[] nums = {1, 5, 7, -1, 5};
        int k = 6;

       System.out.println(countPairs(nums, 6));


}
    public static int countPairs(int[] nums, int k) {

        Map<Integer, Integer> freq = new HashMap<>();

        int count = 0;

        for (int num : nums) {

            count += freq.getOrDefault(k - num, 0);

            freq.put(
                    num,
                    freq.getOrDefault(num, 0) + 1);
        }

        return count;
    }
}