import java.util.HashSet;

public class question32 {
    public static int lengthOfLongestSubstring(String sc) {
        int n = sc.length();
        int maxLength = 0;
        int left = 0;

        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < n; right++) {
            while (set.contains(sc.charAt(right))) {
                set.remove(sc.charAt(left));
                left++;
            }
            set.add(sc.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        int result = lengthOfLongestSubstring(s);
        System.out.println("Length of Longest Substring Without Repeating Characters: " + result);
    }
}
