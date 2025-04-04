//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) { // i represent the current index

//            find the minimum element  in unsorted ARRAY
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
//          swap current element and minimum element--> current index i will have correct element
//            a[min_index],a[i]
            System.out.println(min_index+""+i);
            if (min_index != i) {
                int temp = arr[i];
                arr[i] = arr[min_index];
                arr[min_index] = temp;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {7, 7,4, 5, 1, 2};
        selectionSort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}