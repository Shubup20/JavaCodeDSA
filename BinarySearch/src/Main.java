//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static boolean binarySearch(int[] arr, int target) {
        int n = arr.length;
        int st = 0;
        int end = n - 1;

        while (st <= end) {
//            int mid = (st + end) / 2;

            int mid = st+(end-st)/2;  // so this done because if end is max value in jav 21478454654 the show error mid = (st +end)/2
            if (target == arr[mid]) {
                return true;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 15, 20, 24, 45, 50, 72};
        int target = 45;

        boolean result = binarySearch(arr, target);
        System.out.print("Result is " + result);

    }
}