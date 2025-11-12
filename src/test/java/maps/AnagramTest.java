package maps;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class AnagramTest {

    @Test
    public void test1(){
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s,t));
    }

    @Test
    public void test2(){
        String s = "rat";
        String t = "car";
        System.out.println(isAnagram(s,t));
    }

    private boolean isAnagramMap(String s, String t) {
        if(s.length()!=t.length())return false;
        Map<Character,Integer> sMap = new HashMap<>();
        Map<Character,Integer> tMap = new HashMap<>();

        for(Character c:s.toCharArray())sMap.put(c,sMap.getOrDefault(c,0)+1);
        for(Character c:t.toCharArray())tMap.put(c,tMap.getOrDefault(c,0)+1);
        return sMap.equals(tMap);
    }

    private boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        int[] countArr = new int[26];
        for(int i=0;i<t.length();i++){
            countArr[s.charAt(i)-'a']++;
            countArr[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(countArr[i]!=0)return false;
        }
        return true;
    }
}
