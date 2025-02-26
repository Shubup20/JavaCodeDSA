import java.util.Scanner;

public class sumOfDigits {

    static int sumDigits(int n) {

//        basic case
        if (n <= 9 && n >= 0) return n;

//        subProblem=>RecursiveWork
//        int lastDigit = sumDigits(n % 10);
//        int newNum = sumDigits(n / 10);

//        selfCase

//        return lastDigit + newNum;

        return sumDigits(n / 10) + sumDigits(n % 10);
    }


    static int countDigits(int n) {

//base case
        if (n / 10 == 0) return 1;

        return 1 + countDigits(n / 10);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int sum = sumDigits(n);
        System.out.println(sum);


        int digit = countDigits(n);
        System.out.println(digit);
    }
}
