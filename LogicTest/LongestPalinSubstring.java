package LogicTest;


import java.util.Scanner;

class LongestPalinSubstring {
  private static String findLongestPalindromicSubstring(String input) {
    if(input.isEmpty()) {
      return "";
    }
    int n = input.length();
    int longestSoFar = 0, startIndex = 0, endIndex = 0;
    boolean[][] palindrom = new boolean[n][n];
  
    for(int i = 0; i < n; i++) {
      palindrom[i][i] = true;
      for(int j = 0; j < i; j++) {
        if(input.charAt(i) == input.charAt(j) && (i-j <= 2 || palindrom[j+1][i-1])) {
          palindrom[j][i] = true;
          if(i-j+1 > longestSoFar) {
            longestSoFar = i-j+1;
            startIndex = j;
            endIndex = i;
          }  
        }
      }
    }
    return input.substring(startIndex, endIndex+1);
  }
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String input = keyboard.next();
    System.out.println(findLongestPalindromicSubstring(input));
  }
}