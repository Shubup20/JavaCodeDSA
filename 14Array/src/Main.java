class ArrayExample {

    void multiArray() {
//        int[][] arr_1= new int[5][3];
        int[][] arr = {{56,44,85},{84,45,65},{8,5,7}};
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);

//        int[][][] arr_3 = new int[5][3][2];//5*3*2=30
//        arr_3[0][0][0] = 1;
    }

    void demoArray() {
        int[] ages = new int[5];
        String[] names = {"rahul", "Raj", "Adhara"};


        ages[0] = 34;
        ages[1] = 44;
        ages[2] = 64;

//    ages[5] = 78;
//    ages[-4] = 45;


        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);


        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
//
//   System.out.println(ages[-4]);
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayExample obj = new ArrayExample();
        obj.demoArray();



        obj.multiArray();

    }
}