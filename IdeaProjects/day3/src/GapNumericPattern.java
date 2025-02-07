import java.util.Scanner;

public class GapNumericPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // Print numbers and spaces in between
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (i == 1 || i == n || j == 1 || j == (2 * i - 1)) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
