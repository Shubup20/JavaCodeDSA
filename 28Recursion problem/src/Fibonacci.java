import java.util.Scanner;

public class Fibonacci {

    static int fib(int n) {
//base case
        if (n == 0 || n == 1) return n;

//        subProblem ->Recursive work
        int prev = fib(n - 1);
        int prevPrev = fib(n - 2);

//        self work
        return prev + prevPrev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth term n:  ");
        int n = sc.nextInt();

        int ans = fib(n);
        System.out.println(ans);

//        if asked print nth term fibonacci series then
        System.out.println("print" + n + "fibonacci series: ");
        for (int i = 0; i <= n; i++) {
            System.out.println(fib(i));
        }

    }
}
