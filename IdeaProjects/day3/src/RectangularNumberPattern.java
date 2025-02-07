import java.util.Scanner;

public class RectangularNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextByte(), c= sc.nextByte();

        for(int i =1;i<=r;i++){
            for(int j=1;j<=c;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
