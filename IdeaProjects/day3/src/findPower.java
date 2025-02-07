import java.util.Scanner;

public class findPower {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two Number a: ");
        int a = sc.nextInt();

        System.out.println("Enter two Number b: ");
        int b = sc.nextInt();

        int ans = 1;
       for(int i=1;i<=b;i++){
           ans *=a;
       }
       System.out.print(ans);
    }
}
