public class ValidPalindrome {
    public static boolean palindromeString(String s){
        int left = 0;
        int right = s.length()-1;

        while(left < right){
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args){
        String e = "Lool : looL";
        String s = e.toLowerCase();
        System.out.println(palindromeString(s));
    }
}
