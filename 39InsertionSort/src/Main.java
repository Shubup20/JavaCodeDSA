//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static void insertion(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {

            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }

        }

    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 2, 7, 3, 10, 1};
        insertion(arr);

        for (int elem : arr) {
            System.out.print(elem + " ");
        }
    }
}