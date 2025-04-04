import java.util.*;

public class Main {

    public static int solve(int[] arr) {
        Set<Long> target = new HashSet<>();
        for (int num : arr) {
            target.add((long) num);
        }

        if (target.isEmpty()) return 0;

        Queue<long[]> queue = new LinkedList<>();
        Set<Long> visited = new HashSet<>();

        // Start with an initial container with value 0
        queue.add(new long[]{0, 1}); // Starting with one initial container
        visited.add(0L);

        while (!queue.isEmpty()) {
            long[] current = queue.poll();
            long value = current[0];
            int containers = (int) current[1];

            // If the current value is part of the target, remove it from the target set
            if (target.contains(value)) {
                target.remove(value);
                if (target.isEmpty()) {
                    return containers; // Return the number of containers used
                }
            }

            // Check all possible sums with the current array values
            for (int num : arr) {
                long sum1 = value + num;

                // Add the new sum to the queue if it hasn't been visited
                if (!visited.contains(sum1)) {
                    visited.add(sum1);
                    queue.add(new long[]{sum1, containers});
                }

                // If using a new container, increment the container count
                if (!visited.contains((long) num)) {
                    visited.add((long) num);
                    queue.add(new long[]{num, containers + 1});
                }
            }
        }
        return -1; // If it is impossible to generate all numbers
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // Read the number of elements in the array (not used)
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(solve(arr));
    }
}