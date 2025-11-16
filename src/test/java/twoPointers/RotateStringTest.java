package twoPointers;

import org.testng.annotations.Test;

public class RotateStringTest {

    @Test
    public void test1(){
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(rotateString(s,goal));
        System.out.println(rotateStringII(s,goal));

    }

    @Test
    public void test2(){
        String s = "abcde";
        String goal = "abced";
        System.out.println(rotateString(s,goal));
        System.out.println(rotateStringII(s,goal));

    }

    private boolean rotateString(String s, String goal) {
        for (int i= 0; i < s.length(); i++) {
            s=s.substring(1)+s.charAt(0);
            if(s.equals(goal))return true;
        }
        return false;
    }

    private boolean rotateStringII(String s,String goal){
         s = s+s;
         return s.contains(goal);
    }
}
