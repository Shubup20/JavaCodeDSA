class ArrayExample {

    void searchArray() {
        int[] arr = {2, 8, 19, 2, 7};

        int x = 19;
        int ans = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
            ans = i;
            break;
            }
            System.out.println("Found " + "x" + ans);
        }
    }

    void maxNum() {
        int[] arr = {2, 8, 19, 2, 7};


        int maxNum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maxNum < arr[i]) {
                maxNum = arr[i];
            }
        }

        System.out.println("maxNum is : " + maxNum);

    }


    void multiArray() {
//        int[][] arr_1= new int[5][3];
        int[][] arr = {{56, 44, 85}, {34, 7, 8}};

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(arr[i][j]);


            }
        }


//        int[][][] arr_3 = new int[5][3][2];//5*3*2=30
//        arr_3[0][0][0] = 1;
    }

    void demoArray() {
        int[] ages = new int[5];
//        String[] names = {"rahul", "Raj", "Adhara"};


        ages[0] = 34;
        ages[1] = 44;
        ages[2] = 64;

//    ages[5] = 78;
//    ages[-4] = 45;

//
//        System.out.println(names[0]);
//        System.out.println(names[1]);
//        System.out.println(names[2]);


//        System.out.println(ages[0]);
//        System.out.println(ages[1]);
//        System.out.println(ages[2]);
////
//   System.out.println(ages[-4]);

//        for(int i = 0 ;i<3;i++){
//            System.out.println(ages[i]);
//        }

//        for(int age:ages){
//            System.out.println(age);
//        }

        int i = 0;
        while (i < 3) {
            System.out.println(ages[i]);
            ++i;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayExample obj = new ArrayExample();
//        obj.demoArray();


        obj.multiArray();

        obj.maxNum();
        obj.searchArray();
    }
}