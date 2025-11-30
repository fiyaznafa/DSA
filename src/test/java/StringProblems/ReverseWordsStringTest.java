package StringProblems;

import org.testng.annotations.Test;

public class ReverseWordsStringTest {

    @Test
    public void test1(){
        String s ="the sky is blue";
        reverseWords(s);
    }

    @Test
    public void test2(){
        String s ="  hello world  ";
        reverseWords(s);
    }

    private void reverseWords(String s) {
        StringBuilder reverse = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        for (int i = s.length()-1; i >=0 ; i--) {
            char c= s.charAt(i);
            if(Character.isAlphabetic(c) || Character.isDigit(c))sb.append(c);
            else {
                if(!sb.isEmpty()) {
                    reverse.append(sb.reverse());
                    reverse.append(" ");
                    sb.delete(0,sb.length());
                }
            }
        }
        reverse.append(sb.reverse());
        System.out.println(reverse.toString().trim());
    }
}
