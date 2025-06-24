public class question34 {
    public static boolean isRotation(String s1, String s2) {
    
        if (s1 == null || s2 == null) return false;
        if (s1.length() != s2.length()) return false;

        String concatenated = s1 + s1;
        return concatenated.contains(s2);
    }
    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";

        if (isRotation(s1, s2)) {
            System.out.println(s2 + " is a rotation of " + s1);
        } else {
            System.out.println(s2 + " is not a rotation of " + s1);
        }
    }
}
