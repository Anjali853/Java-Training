import java.util.HashSet;

public class question13{
    public static void findPairs(int[] arr, int target) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<String> output = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;
            if (seen.contains(complement)) {
                int min = Math.min(num, complement);
                int max = Math.max(num, complement);
                String pair = min + ", " + max;
                if (!output.contains(pair)) {
                    System.out.println("(" + min + ", " + max + ")");
                    output.add(pair);
                }
            }
            seen.add(num);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int target = 6;
        findPairs(arr, target);
    }
}
