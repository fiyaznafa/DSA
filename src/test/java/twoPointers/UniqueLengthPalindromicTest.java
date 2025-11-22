package twoPointers;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

public class UniqueLengthPalindromicTest {

    @Test
    public void test1(){
        String s = "aabca";
        System.out.println(uniqueThreePalindrome(s));
    }

    @Test
    public void test2(){
        String s = "adc";
        System.out.println(uniqueThreePalindrome(s));
    }

    @Test
    public void test3(){
        String s = "bbcbaba";
        System.out.println(uniqueThreePalindrome(s));
    }

    private int uniqueThreePalindrome(String s) {
        Set<Character> set = new HashSet<>();
        for(char c:s.toCharArray()){
            set.add(c);
        }

        int res=0;

        for(char c:set){
            int firstOccurence = s.indexOf(c);
            int lastOccunrence = s.lastIndexOf(c);
            res+=findAllPalindrome(s,firstOccurence,lastOccunrence);
        }
        return  res;
    }

    private int findAllPalindrome(String s, int firstOccurence, int lastOccunrence) {
        int left= firstOccurence+1;
        int right = lastOccunrence;
        Set<Character> set = new HashSet<>();
        while(left<right){
            set.add(s.charAt(left++));
        }
        return set.size();
    }


}
