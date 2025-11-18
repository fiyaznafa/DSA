package maps;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagramsTest {

    @Test
    public void test1(){
        String[] str = {"eat","tea","tan","ate","nat","bat"};

        for(List<String> list:groupAnagram(str))
            System.out.println(list);
    }

    private List<List<String>> groupAnagram(String[] str) {
        if(str==null || str.length==0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String word:str){

            char[] freq = new char[26];
            for(int i=0;i<word.length();i++)freq[word.charAt(i)-'a']++;
            String s = new String(freq);
            List<String> tempList = map.getOrDefault(s,new ArrayList<>());
            tempList.add(word);
            map.put(s,tempList);
        }
        return new ArrayList<>(map.values());
    }
}
