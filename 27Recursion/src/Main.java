import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static void printIncreasing(int n) {

        if (n == 1) {// base case
            System.out.println(n);
            return;
        }
        printIncreasing(n - 1);//recursive work
        System.out.println(n);//self work


    }

    static void printDecreasing(int n) {
        if (n == 1) {//base case
            System.out.println(n);
            return;
        }

        System.out.println(n);//self case
        printDecreasing(n - 1);//recursion work
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printIncreasing(n);
        System.out.println();
        System.out.println();
        printDecreasing(n);
    }
}