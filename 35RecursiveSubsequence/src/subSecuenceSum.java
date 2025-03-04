public class subSecuenceSum {

    static void subSecSum(int[] arr, int n, int idx, int sum) {

        if (idx == n) {
            System.out.println(sum);
            return;
        }

//        cur idx +curr sum
        subSecSum(arr, n, idx + 1, sum + arr[idx]);
//        cur ans

        subSecSum(arr, n, idx + 1, sum);
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 5};

        subSecSum(arr, arr.length, 0, 0);
    }
}
