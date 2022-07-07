import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String max = "a";
        List<String> list = Arrays.asList("ELRMENMET",
                "BABCBAB",
                "AAAAAA",
                "CacaaC",
                "forgeegsskeepfor");
        for (String s : list) {
            if (isPalindrome(s)) {
                if (max.length() < s.length()) {
                    max = s;
                }
            }
        }
        System.out.println(max);

    }

//                // Version 1.
//    public static Boolean isPalindrome(String s) {
//        return s.equals((new StringBuilder(s)).reverse().toString());
//    }

                  // Version 2.
    public static Boolean isPalindrome(String s) {
        if (s.length() == 1 || s.length() == 0)
            return true;

        if (s.charAt(0) == s.charAt(s.length() - 1))
            return isPalindrome(s.substring(1, s.length() - 1));

        return false;
    }

}
