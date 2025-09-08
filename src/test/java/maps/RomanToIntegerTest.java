package maps;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class RomanToIntegerTest {

    @Test
    public void test1(){
       String s = "III";
       System.out.println(romanToInt(s));
    }

    @Test
    public void test2(){
        String s = "LVIII";
        System.out.println(romanToInt(s));
    }

    @Test
    public void test3(){
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }

    private int romanToInt(String s) {
        int sum=0,curr,prev=0;
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        for (int i = s.length()-1; i >=0 ; i--) {
            curr= map.get(s.charAt(i));
            if(prev>curr)sum-=curr;
            else sum+=curr;
            prev=curr;
        }
        return sum;
    }
}
