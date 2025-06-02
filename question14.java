import java.util.*;

public class question14 {
    public static void findSubarray(int[] arr, int target) {
        int start = 0, sum = 0;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];  
            while (sum > target && start < end) {
                sum -= arr[start];
                start++;
            }
            if (sum == target) {
                System.out.println("Subarray found between index " + start + " and " + end);
                return;
            }
        }

        System.out.println("No subarray found.");
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5}; 
        int target = 33;
        findSubarray(arr, target);
    }
}
