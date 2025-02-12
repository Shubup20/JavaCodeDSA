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
//            int c = 10; //block scope variable
        }
//        System.out.println(c);
    }
}

public class Main {
 static    void changeValue(int a){
        a*=100;

     System.out.println("inside change value: "+ a);
    }
    public static void main(String[] args) {
        Algebra obj = new Algebra();
        System.out.println(obj.add());
        System.out.println(obj.sub());
        obj.demo();

        int a = 10;
        System.out.println("Before changing value: " + a);
        changeValue(a);
        System.out.println("After changing value: " + a);
    }
}