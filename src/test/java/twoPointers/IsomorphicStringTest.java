package twoPointers;

import org.testng.annotations.Test;

public class IsomorphicStringTest {

    @Test
    public void test1(){
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphic(s,t));
        System.out.println(isomorphic(s,t));
    }

    @Test
    public void test2(){
        String s = "foo";
        String t = "bar";
        System.out.println(isIsomorphic(s,t));
        System.out.println(isIsomorphic(s,t));
    }

    @Test
    public void test3(){
        String s = "paper";
        String t = "title";
        System.out.println(isIsomorphic(s,t));
        System.out.println(isIsomorphic(s,t));
    }

    private boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())return false;
        int[] sArr = new int[128];
        int[] tArr = new int[128];
        for (int i = 0; i < s.length(); i++) {
            if(sArr[s.charAt(i)]=='\u0000') sArr[s.charAt(i)]=t.charAt(i);
            if(tArr[t.charAt(i)]=='\u0000') tArr[t.charAt(i)]=s.charAt(i);
            if(sArr[s.charAt(i)]!=t.charAt(i) || tArr[t.charAt(i)]!=s.charAt(i))return false;
        }
        return true;
    }

    private boolean isomorphic(String s, String t) {
        if(s.length()!=t.length())return false;
        int[] sArr = new int[129];
        int[] tArr = new int[129];
        for (int i = 0; i < s.length(); i++) {
           if(sArr[s.charAt(i)]!=tArr[t.charAt(i)])return false;
           sArr[s.charAt(i)]=i+1;
           tArr[t.charAt(i)]=i+1;
        }
        return true;
    }


}
