//import java.util.Scanner;

class Algebra {
    int a, b;

    Algebra(int x, int y) {
        System.out.println("Constructor of Algebra Class");
        a = x;
        b = y;
    }

    int add() {

        return a + b;
    }

    int sub() {
        return a - b;
    }

    int mul() {
        return a * b;
    }
}

public class Main {
    public static void main(String[] args) {
        Algebra obj = new Algebra(5, 7);
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextByte(), y = sc.nextByte();
        System.out.println("Sum of Input Number: ");

        System.out.println("sum: " + obj.add());
        System.out.println("sub: " + obj.sub());
        System.out.println("mul: " + obj.mul());


        Algebra obj2 = new Algebra(8, 45);
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextByte(), y = sc.nextByte();
        System.out.println("Sum of Input Number: ");

        System.out.println("sum: " + obj2.add());
        System.out.println("sub: " + obj2.sub());
        System.out.println("mul: " + obj2.mul());

//        System.out.println(Math.sqrt(24));
//        System.out.println(Math.sqrt(16));
//
//        System.out.println(Math.floor(5.3));
//        System.out.println(Math.floor(5.8));
//
//        System.out.println(Math.ceil(5.3));
//        System.out.println(Math.ceil(5.8));


    }
}