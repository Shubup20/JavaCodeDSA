import java.util.Arrays;
import java.util.Scanner;

public class PairSum {
    static int pairSum(int[] arr, int target) {
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    ans++;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");

        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " element :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array is : " + Arrays.toString(arr));
        System.out.println("Target: ");
        int target = sc.nextInt();
        System.out.println(pairSum(arr,target ));


    }
}

