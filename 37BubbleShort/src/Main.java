//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static void bubbleSort(int[] a) {

        int n = a.length;

//        increasing order short
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = 0; j < n - i - 1; j++) {
//                if (a[j] > a[j + 1]) {
//                    int temp = a[j];
//                    a[j] = a[j + 1];
//                    a[j + 1] = temp;
//                }
//            }
//        }

//        decreasing order
        for (int i = 0; i < n - 1; i++) {

            boolean flag = false;// has only swapping happened
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] < a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = true; //some swap has happened
                }
            }
            if (!flag) {//have any swap has happened
                return;
            }
        }

    }

    public static void main(String[] args) {
//        int[] a = {7, 6, 5, 4, 3};
        int[] a = {2, 4, 5, 6, 7};
        bubbleSort(a);

        for (int i : a) System.out.print(i + " ");
    }
}