import java.util.Scanner;

public class Multiples {

    static void printMulti(int n, int k) {

//        Base case
        if (k == 0) return;


//        recursive work
        printMulti(n, k - 1);//5 10 15

// self work
        System.out.println(n * k);
      }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the n And k : ");
        int n = sc.nextInt(), k = sc.nextInt();

        printMulti(n, k);

    }
}
