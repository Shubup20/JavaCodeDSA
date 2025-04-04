import java.util.Scanner;

public class PrefixSum {
    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] makePrefixSumArray(int[] arr) {
        int n = arr.length;
        for(int i =1 ;i<n;i++){
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Element : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter" + n + "Element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Input Array: ");
        printArray(arr);

        int[] pref = makePrefixSumArray(arr);
        printArray(pref);
    }
}
