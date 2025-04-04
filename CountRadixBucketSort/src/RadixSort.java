public class RadixSort {

    static int findMax(int[] arr) {
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        return mx;
    }

    static void countSort(int[] arr, int place) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];
        for (int i = 0; i < count.length; i++) {// Make frequency array
            count[(arr[i] / place) % 10]++;
        }
        //Make  prefix sum array of count array
        for (int i = n - 1; i >= 0; i--) {
            int idx = count[(arr[i] / place) % 10] - 1;
            output[idx] = arr[i];
            count[(arr[i] / place) % 10]--;
        }
        //copy all elements of output to arr
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    static void radixShort(int[] arr) {
        int max = findMax(arr);
        //apply counting sort to sort element based on place value
        for (int place = 1; max / place > 0; place *= 10) {
            countSort(arr, place);

        }
    }

    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 2};
        radixShort(arr);
        for (int elem : arr) {
            System.out.print(elem + " ");
        }
    }
}
