import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);

//        arr={1,5,4,4},arr[0];

        char ch = s.charAt(0);
        System.out.println(ch);
        System.out.println(s.length());
        System.out.println(s.substring(2,4));
    }
}