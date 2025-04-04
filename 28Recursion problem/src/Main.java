import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static int factorial(int n) {
        if (n == 0) return 1;//base case

        //smaller problem recursive work

        int smallAns = factorial(n-1);

        // big problem self work
        int ans = n* smallAns;
        return ans;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int n = sc.nextInt();
        int fact = factorial(n);
        System.out.println(fact);
    }
}