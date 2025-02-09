class Algebra {
    int a = 10;//member variable class variable
    int b = 20;


    int add() {
        int p = 100;//method scope variable
        int q = 25;
        return p + q;
    }


    int sub() {
        return a - b;
    }

    void demo() {
        int a = 10;
        System.out.println(a);
        {
            int c = 10; //block scope variable
        }
//        System.out.println(c);
    }
}

public class Main {
    public static void main(String[] args) {
        Algebra obj = new Algebra();
        System.out.println(obj.add());
        System.out.println(obj.sub());
        obj.demo();
    }
}