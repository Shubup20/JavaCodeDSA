import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        int numOfDigits = 0;

      while (num>0){
          num= num/10;
          numOfDigits++;
      }
      System.out.print("Number of digits: " + numOfDigits);
    }
}
