import java.util.Scanner;

public class TransposeMatrix {

    static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] findTranspose(int[][] arr, int r, int c) {
        int[][] ans = new int[c][r];
        for (int i = 0; i < c; i++) {//row
            for (int j = 0; j < r; j++) {//col
                ans[i][j] = arr[j][i];

            }
        }
        return ans;
    }

    static void transposeInPlace(int[][] arr, int r, int c) {
        for (int i = 0; i < c; i++) {//row
            for (int j = i; j < r; j++) {//col
//             swat arr[i][j] ,arr[j][i]
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the row and column: ");
        int r = sc.nextInt(), c = sc.nextInt();
        int[][] arr = new int[r][c];

        int totalElement = r * c;

        System.out.println("Enter the " + totalElement + " element of Array: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("input arr : ");
        printMatrix(arr);

        System.out.println("Transpose of matrix: ");

//        int[][] ans = findTranspose(arr, r, c);
//        printMatrix(ans);

        transposeInPlace(arr, r, c);
        printMatrix(arr);

    }
}
