import java.util.Scanner;

public class SuffixSum {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] suffixSumArray(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        ans[n - 1] = arr[n - 1]; // Initialize the last element

        // Calculate suffix sums from the end
        for (int i = n - 2; i >= 0; i--) {
            ans[i] = arr[i] + ans[i + 1];
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Input array is : ");
        printArray(arr);
        int[] suffArray = suffixSumArray(arr);
        printArray(suffArray);
    }
}
