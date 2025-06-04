import java.util.HashSet;
import java.util.ArrayList;

public class question17{
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 4, 5, 6};
        int[] arr2 = {2, 4, 6, 8};
        ArrayList<Integer> result = findIntersection(arr1, arr2);

        System.out.println("Intersection of arrays:");

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    public static ArrayList<Integer> findIntersection(int[] arr1, int[] arr2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();

        for (int num : arr1) {
            set1.add(num);
        }
        
        for (int num : arr2) {
            if (set1.contains(num)) {
                intersection.add(num);
            }
        }
        return new ArrayList<>(intersection);
    }
}