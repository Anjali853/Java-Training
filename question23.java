import java.util.HashSet;
public class question23{
    public static String removeDuplicatesHashSet(String str) {

        HashSet<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (seen.add(c)) {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "programming";
        String output = removeDuplicatesHashSet(input);
        System.out.println("Original: " + input);
        System.out.println("Without duplicates: " + output);
    }
}
