package misc;

import org.testng.annotations.Test;

import java.util.Arrays;

public class LongestCommonPrefixTest {

    @Test
    public void test1(){
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestPrefix(strs));
    }

    @Test
    public void test2(){
        String[] strs = {"dog","racecar","car"};
        System.out.println(longestPrefix(strs));
    }

    private String longestPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder sb = new StringBuilder();
        String firstWord = strs[0];
        String lastWord = strs[strs.length-1];
        for(int i=0;i<strs[0].length();i++){
            if(firstWord.charAt(i)==lastWord.charAt(i))
                sb.append(firstWord.charAt(i));
            else break;
        }
        return sb.toString();
    }
}
