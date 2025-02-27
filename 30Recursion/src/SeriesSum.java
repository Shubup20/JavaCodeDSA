import java.util.Scanner;

public class SeriesSum {

    static int printNature(int n) {
//base case
        if (n == 0) return 0;

//        recursion work
        int num = printNature(n - 1);

//       self case
        return num + n;

    }

    static int printNature2(int n) {
//base case
        if (n == 0) return 0;

//        recursion work
        if (n % 2 == 0) return printNature2(n - 1) - n;

        return printNature2(n - 1) + n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int ans = printNature(n);
//        System.out.print(ans);

        int ans2 = printNature2(n);
        System.out.println(ans2);

    }
}
