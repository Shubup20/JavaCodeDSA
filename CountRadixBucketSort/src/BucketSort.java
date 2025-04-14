import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {


    static void bucketSort(float[] arr) {
        int n = arr.length;
        //    buckets
//        int[] arr = new int[5]

        ArrayList<Float>[] buckets = new ArrayList[n];
//        create empty  buckets

        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }

        //Add element into our buckets

        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) arr[i] * n;
            buckets[bucketIndex].add(arr[i]);
        }

        //sort each bucket individually

        for (int i = 0; i < buckets.length; i++) {
            Collections.sort(buckets[i]);
        }

        //Merge all buckets to get final sorted array
        int index = 0;
        for (int i = 0; i < buckets.length; i++) {
            ArrayList<Float> currBucket = buckets[i];
            for (int j = 0; j < currBucket.size(); j++) {
                arr[index++] = currBucket.get(j);
            }
        }
    }

    public static void main(String[] args) {
        float[] a = {0.5f, 0.4f, 0.3f, 0.2f, 0.f};
        bucketSort(a);

        for (float elem : a) {
            System.out.print(elem + " ");
        }
    }
}
