import java.util.Scanner;

public class MultiDimensionalArray {

    static void printArray(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Row");
        int r = sc.nextInt();
        System.out.println("Number of Column");
        int c = sc.nextInt();

        int[][] arr = new int[r][c]; //total row*col
        System.out.println("Enter "+ r*c+"element :");
        for(int i=0;i<r;i++){ //row
            for (int j=0;j<c;j++){ //col
                arr[i][j] = sc.nextInt();
            }
        }

//        int[][] arr2 = {{3, 2, 4}, {4, 5, 7}, {2, 4, 4, 8}};
        printArray(arr);

        sc.close();
    }
}
