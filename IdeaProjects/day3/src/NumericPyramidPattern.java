import java.util.Scanner;

public class NumericPyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        for(int i = 1;i<=r;i++){
            for(int j =1;j<=r-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k);
            }
            for(int m=i-1;m>=1;m--){
                System.out.print(m);
            }
            System.out.println();
        }
    }
}
