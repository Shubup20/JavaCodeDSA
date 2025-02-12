public class sumArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int sum=0;
        for(int i=0;i<3;i++){
            int elem = arr[i];
            sum += elem;
        }

        System.out.println(sum);
    }
}
