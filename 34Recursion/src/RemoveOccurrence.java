import java.util.Scanner;


public class RemoveOccurrence {

    static String removeString2(String str) {
//        base case
        if (str.length() == 0) return "";
        String smallAns = removeString2(str.substring(1));

//        recursive work
        char currChar = str.charAt(0);
        if (currChar != 'a') {

            return currChar + smallAns;
        } else {
            return smallAns;
        }
    }

    static String removeString(String str, int idx) {
//base case
        if (idx == str.length()) return "";

//        recursive work

        String smallAns = removeString(str, idx + 1);

        char currChar = str.charAt(idx);
//        self work

        if (currChar != 'a') {
            return currChar + smallAns;

        } else {
            return smallAns;
        }

    }

    //reverse string
    static String reverseString(String str, int idx) {
//base case
        if (idx == str.length()) return "";

//        recursive work
        String smallAns = reverseString(str, idx + 1);


//        self work

        return smallAns + str.charAt(idx);
    }

//    check String is palindrome

    static boolean stringPalindrome(String str, int idx, int n) {
//      base case
        if (idx == str.length()) return true;

//        recursive wor

        return (str.charAt(idx) == str.charAt(n - 1) && stringPalindrome(str, idx+1, n - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idx = 0;

        System.out.print("input str: ");

        String str = sc.nextLine();

        System.out.println("Str: " + str);

        String ans = removeString(str, idx);
        System.out.println("Ans: " + ans);

        String ans2 = removeString2(str);
        System.out.println("Ans2: " + ans2);

        String ans3 = reverseString(str, idx);
        System.out.println("Ans3: " + ans3);

        if (ans3.equals(str)) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is Not Palindrome");
        }
        int n = str.length();
        boolean ans4 = stringPalindrome(str, idx, n);
        if (ans4) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is Not Palindrome");
        }
    }
}
