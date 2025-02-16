

public class MiscProblems {


//    static int[] reverseArray(int[] arr) {
//        int n = arr.length;
//        int[] ans = new int[n];
//        int j = 0;
//

    /// /traverse original array in reverse direction
    /// /this method use inside of for use while
//        for (int i = n - 1; i >= 0; i--) {
//            ans[j++] = arr[i];
//        }
//        return ans;
//    }

    static  void swapInArray(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reverseArray(int[] arr) {
        int i = 0, j = arr.length-1;
        while (i < j) {
            swapInArray(arr, i, j);
            i++;
            j--;
        }
    }

//    static void swap(int a, int b) {
//        System.out.println("Original values before swap");
//        System.out.println("a: " + a);
//        System.out.println("b: " + b);
//with third variable use swap
//        int temp = a;
//        a = b;
//        b = c;

//        with sum and difference method

//        a = a+b; //9+3 = 12
//        b = a-b;  //12-3=9
//        a = a-b;  //12-9=3

//        without third variable use swap
//        int[] arr = {a, b};
//        a = arr[1];
//        b = arr[0];
//
//        System.out.println("Swap values before swap");
//        System.out.println("a: " + a);
//        System.out.println("b: " + b);
//    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

     public static void main(String[] args) {
        int a = 9;
        int b = 3;
        int[] arr = {1, 2, 3, 4, 5,6};
        reverseArray(arr);
        printArray(arr);

//        swap(a,b);
//        int[] ans = reverseArray(arr);
//        printArray(ans);

    }
}
