package maps;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllAnagramsTest {

    @Test
    public void test1(){
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(allAnagrams(s,p));
    }

    @Test
    public void test2(){
        String s = "abab";
        String p = "ab";
        System.out.println(allAnagrams(s,p));
    }

    private List<Integer> allAnagrams(String s, String p) {
        if(s.length()<p.length())return  new ArrayList<>();
        int pLength =p.length();
        List<Integer> result = new ArrayList<>();
        Map<Character,Integer> sMap = new HashMap<>();
        Map<Character,Integer> pMap = new HashMap<>();
        for(Character c:p.toCharArray())pMap.put(c,pMap.getOrDefault(c,0)+1);

        char c;
        char temp;
        for (int i = 0; i < s.length(); i++) {
            c=s.charAt(i);
            sMap.put(c,sMap.getOrDefault(c,0)+1);
            if(i>=pLength-1){
                if(sMap.equals(pMap))result.add(i-(pLength-1));
                temp=s.charAt(i-(pLength-1));
                if(sMap.get(temp)==1)sMap.remove(temp);
                else sMap.put(temp,sMap.get(temp)-1);
            }
        }
        return result;
    }

}
