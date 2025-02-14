import java.util.Arrays;
import java.util.Scanner;

public class Assessment {

    static int lastRepeatingNumber(int[] arr){
        int n = arr.length -1;
        for(int i=n;i>=0;i--){
            System.out.print("i "+i);
            System.out.println();
            for(int j=n-1;j>=0;j--){
                System.out.print("j "+j);
                System.out.println();
                System.out.print("arr[i]"+ arr[i] +"arr[j]"+arr[j]);
                System.out.println();
                if(arr[i]==arr[j] && i!=j){
                    System.out.print("arr[i]:"+arr[i]);
                    return arr[i];
                }
            }
        }
        return  -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");

        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " element :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array is : " + Arrays.toString(arr));

        System.out.println("last Repeating element is : " + lastRepeatingNumber(arr));


    }
}

