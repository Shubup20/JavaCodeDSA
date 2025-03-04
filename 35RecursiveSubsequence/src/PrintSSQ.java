public class PrintSSQ {

    static void printSSQ(String s, String currAns) {//s="abc",curr=""

//base case
        if (s.length() == 0) {
            System.out.println(currAns);
            return;
        }

        char curr = s.charAt(0);//a
        String remString = s.substring(1);//bc

//        curr char --> choose to be a part of currAns
        printSSQ(remString, currAns + curr);

//        curr char --> does not choose to be a part of currAns
        printSSQ(remString, currAns);
    }

    public static void main(String[] args) {

        printSSQ("abc", "");
    }
}
