import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        int sum=0;

        while (num>0){
            sum +=num%10;
            num=num/10;
        }

        System.out.print("Sum Og Digits: "+sum);
    }
}
