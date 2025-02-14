import java.util.Arrays;
import java.util.Scanner;

public class RepeatingNumber {

    static int firstRepeatingNumber(int[] arr) {


        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {

                    return arr[i];
                }
            }
        }

        return -1;
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

        System.out.println("First Repeating number in Array is : " + firstRepeatingNumber(arr));

    }
}
