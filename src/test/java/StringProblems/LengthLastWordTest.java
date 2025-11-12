package StringProblems;

import org.testng.annotations.Test;

public class LengthLastWordTest {

    @Test
    public void test1() {
        String s = "Hello World";
        System.out.println(lengthLastWord(s));
    }

    @Test
    public void test2() {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthLastWord(s));
    }

    @Test
    public void test3() {
        String s = "luffy is still joyboy";
        System.out.println(lengthLastWord(s));
    }

    @Test
    public void test4() {
        String s = "ay";
        System.out.println(lengthLastWord(s));
    }

    private int lengthLastWord(String s) {
        int right = s.length() - 1;
        int count = 0;
        while (right >= 0 && s.charAt(right) == ' ') right--;
        while (right >= 0 && Character.isAlphabetic(s.charAt(right--))) count++;
        return count;
    }
}
