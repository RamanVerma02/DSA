
public class Is_Subsquence {
    public static boolean isSubseq(String s, String t) {
        int i = 0;

        for (int j = 0; j < t.length(); j++) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } else {
                j++;
            }

            if (i == s.length()) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "ace";
        String t = "abcde";
        System.out.println(isSubseq(s, t));
    }
}