package twoPointers;

import org.testng.annotations.Test;

public class LongestPalindromicStringTest {

    @Test
    public void test1(){
        String s = "babad";
        longestPalindrone(s);
    }

    @Test
    public void test2(){
        String s = "cbbd";
        longestPalindrone(s);
    }

    @Test
    public void test3(){
        String s = "abc";
        longestPalindrone(s);
    }

    private void longestPalindrone(String s) {
        if(s.length()<=2){
            System.out.println(s);
            return;
        }
        String palindrome = "";
        for (int i = 0; i <s.length() ; i++) {
            String s1 = palindromicString(s,i,i);
            palindrome = s1.length()>palindrome.length()?s1:palindrome;
            String s2 = palindromicString(s,i,i+1);
            palindrome = s2.length()>palindrome.length()?s2:palindrome;
        }
        System.out.println(palindrome);
    }

    private String palindromicString(String s, int left, int right) {
        String palindrome = String.valueOf(s.charAt(left));
        while (left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        palindrome = s.substring(left+1,right);
        return palindrome;
    }
}
