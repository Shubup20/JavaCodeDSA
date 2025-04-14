//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static int findMin(int[] arr) {
        int n = arr.length, ans = -1, st = 0, end = n - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] <= arr[n - 1]) {
                ans = mid;
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 1, 2};
        System.out.println    (findMin(arr));
        System.out.println("Value: " + arr[findMin(arr)]);
    }
}