package twoPointers;

import org.testng.annotations.Test;

public class FirstIndexOccurenceTest {

    @Test
    public void test1(){
        String  haystack = "sadbutsad", needle = "sad";
        System.out.println(firstOccurence(haystack,needle));
    }

    @Test
    public void test2(){
        String  haystack = "leetcode", needle = "leeto";
        System.out.println(firstOccurence(haystack,needle));
    }

    @Test
    public void test3(){
        String  haystack = "hello", needle = "ll";
        System.out.println(firstOccurence(haystack,needle));
    }

    private int firstOccurence(String haystack, String needle) {
       int n=haystack.length(), m= needle.length();
       if(m>n)return -1;
       int start=0;

       while(start+m<=n){
           while(start+m<=n && haystack.charAt(start)!=needle.charAt(0))start++;

           if(start+m>n)return -1;
           if(haystack.regionMatches(start,needle,0,m)) return start;
           start++;
       }
       return -1;

    }
}
