import java.util.Scanner;

public class RangeQuery {

    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] makePrefixSumArray(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Element : ");
        int n = sc.nextInt();
        int[] arr = new int[n + 1];

        System.out.println("Enter" + n + "Element");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Input Array: ");
        printArray(arr);
        int[] prefSum = makePrefixSumArray(arr);

        System.out.println("Enter the queries: ");
        int q = sc.nextInt();

        while (q-- > 0) {
            System.out.println("Enter Range");
            System.out.print("l: ");
            int l = sc.nextInt();
            System.out.print("r: ");
            int r = sc.nextInt();

            int ans = prefSum[r] - prefSum[l - 1];
            System.out.println("Sum: " + ans);
        }

    }
}
