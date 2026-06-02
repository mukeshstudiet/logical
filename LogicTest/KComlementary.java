package LogicTest;
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

public class KComlementary {
	int complementary_pairs ( int k,int[] A ) {
        HashMap<Long, ArrayList<Integer>>  compl = new HashMap<Long, ArrayList<Integer>>();
            for (int i = 0; i<  A.length; i++) {
                ArrayList<Integer>  tmp = compl.get(((long) k) - A[i]);
                if (tmp == null)
                    tmp = new ArrayList<Integer>();
                tmp.add(i);
                compl.put(((long) k) - A[i], tmp);
            }
            int counter = 0;
            for (int i = 0; i<  A.length; i++)
                if (compl.containsKey(Long.valueOf(A[i]))) {
                    counter += compl.get(Long.valueOf(A[i])).size();
                }
            return counter;
    }
}

