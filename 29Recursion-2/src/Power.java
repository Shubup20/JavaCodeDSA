import java.util.Scanner;

public class Power {

//    static int pow(int p, int q) {//==> TC = o(q)

    /// /        base case
//        if (q == 0) return 1;
//
//
//    //        recursive work
//
//        return pow(p, q - 1) * p;
//    }
    static int pow(int p, int q) {
//        base case
        if (q == 0) return 1;

        int smallPow = pow(p, q / 2);

        if (q % 2 == 0) {
            return smallPow * smallPow;
        }
        return smallPow * smallPow * p;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt(), q = sc.nextInt();

        int ans = pow(p, q);
        System.out.println(ans);

    }
}
