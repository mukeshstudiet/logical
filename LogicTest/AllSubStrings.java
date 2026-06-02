package LogicTest;

//Java program to print all possible 
//substrings of a given string 

class AllSubStrings {

    //Function to print all sub strings
    static void allSubString(char str[], int n) {
        // Pick starting point
        String str = "abc";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }
}

    //Driver program to test above function
    public static void main(String[] args) {
        char str[] = {'a', 'b', 'c'};
        allSubString(str, str.length);

    }
}
//This code is contributed by PrinciRaj1992 