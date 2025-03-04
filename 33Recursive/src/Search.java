import java.util.ArrayList;

public class Search {
    //return true and false
    static boolean search(int[] arr, int target, int idx) {


//        base case
        if (idx == arr.length) {
            return false;
        }
        //        self work

        if (arr[idx] == target) return true;

//        recursive work
        return search(arr, target, idx + 1);
    }

    //    return index of target if target present in array,otherwise return -1;
    static int findIndex(int[] arr, int target, int idx) {
//base case
        if (idx == arr.length) return -1;

//        self work
        if (arr[idx] == target) return idx;

//        recursive work
        return findIndex(arr, target, idx + 1);


    }

    static void findAllIndex(int[] arr, int target, int idx) {
//base case
        if (idx == arr.length) return;

//        self work
        if (arr[idx] == target) {
            System.out.println(idx);
        }

//        recursive work
        findAllIndex(arr, target, idx + 1);
    }

    static ArrayList<Integer> findArrayList(int[] arr, int target, int idx) {
// base case
        if (idx == arr.length) return new ArrayList<Integer>(); //return empty arrayList

        ArrayList<Integer> ans = new ArrayList<Integer>();
//        self work
        if (arr[idx] == target) {
            ans.add(idx);
        }
//        recursive work

        ArrayList<Integer> smallAns = findArrayList(arr, target, idx + 1);

        ans.addAll(smallAns);

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 5, 6, 4, 6};
        int target = 6;
        int idx = 0;

//        System.out.println(findIndex(arr, target, idx));

//        findAllIndex(arr, target, idx);

//        if (search(arr, target, idx)) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("False");
//        }


        ArrayList<Integer> ans = findArrayList(arr, target, idx);

        for (Integer i : ans) {
            System.out.println(i);
        }

    }
}
