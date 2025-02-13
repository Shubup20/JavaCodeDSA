import java.util.Arrays;
import java.util.Scanner;

public class Questions {


    static int[] smallestAndLargestElement(int[] arr) {
        Arrays.sort(arr);
        int[] ans = {arr[0], arr[arr.length - 1]};
        return ans;
    }

    static boolean isSorted(int[] arr) {
        boolean check = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                // not shorted

                check = false;
                break;
            }
        }

        return check;
    }

    static int countStrictlyGreater(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                count++;
            }
        }
        return count;
    }

    static int lastOccurrence(int[] arr, int x) {
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    static int countOccurrence(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter x");
        int x = sc.nextInt();


        System.out.println("Count of X :" + countOccurrence(arr, x));
        System.out.println("Last occurrence of x: " + lastOccurrence(arr, x));
        System.out.println("Count of the number of  element Strictly Greater then: " + countStrictlyGreater(arr, x));
        System.out.println("Array is Shorted is : " + isSorted(arr));

        int[] ans = smallestAndLargestElement(arr);
        System.out.println("SmallestAndLargestElement Array: " + ans[0] + "==" + ans[1]);


    }
}

