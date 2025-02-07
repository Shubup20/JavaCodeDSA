import java.util.Scanner;

public class TrilingualPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r =sc.nextByte();
        //pattern 1
        for(int i = 1;i<=r;i++){
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        //pattern 2

        for(int i = 1;i<=r;i++){
            for(int j =r;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
