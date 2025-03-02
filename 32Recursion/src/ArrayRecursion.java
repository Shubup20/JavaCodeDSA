

public class ArrayRecursion {

    static void printArray(int[] arr, int idx) {
//        base case
        if (idx == arr.length) return;

//        sel case
        System.out.println(arr[idx]);
//        recursive work
        printArray(arr, idx + 1);
    }

    static int maxValue(int[] arr, int idx) {

//base case
        if (idx == arr.length - 1) return arr[idx];
//        recursive work
        int smallAns = maxValue(arr, idx + 1);

//        self work
        return Math.max(arr[idx], smallAns);

    }

    static int sumArray(int[] arr2, int idx) {
//    base case
        if (idx == arr2.length) return 0;
//  recursive work
        int smallAns = sumArray(arr2, idx + 1);
//        self work
        return smallAns + arr2[idx];


    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 7, 5, 9};
        int[] arr2 = {5, 4, 5, 2, 3};
        int idx = 0;
        printArray(arr, idx);

        int ans = maxValue(arr, idx);
        System.out.println(ans);

        int ans2 = sumArray(arr2, idx);
        System.out.println(ans2);
    }
}
