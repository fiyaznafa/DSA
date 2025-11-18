package twoPointers;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FruitsInBasketTest {

    @Test
    public void test1(){
        int[] fruits = {1,2,1};
        System.out.println(fruitsInBasket(fruits));
    }

    @Test
    public void test2(){
        int[] fruits = {0,1,2,2};
        System.out.println(fruitsInBasket(fruits));
    }

    @Test
    public void test3(){
        int[] fruits = {1,2,3,2,2};
        System.out.println(fruitsInBasket(fruits));
    }

    @Test
    public void test4(){
        int[] fruits = {3,3,3,1,2,1,1,2,3,3,4};
        System.out.println(fruitsInBasket(fruits));
    }

    private int fruitsInBasket(int[] fruits) {
        Map<Integer,Integer> map = new HashMap<>();
        int left=0,right=0,sum=0,maxSum=0;
        while(right<fruits.length){
            sum++;
            map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);
            while(map.size()>2){
                sum--;
                if(map.get(fruits[left])==1)map.remove(fruits[left]);
                else map.put(fruits[left],map.get(fruits[left])-1);
                left++;
            }
            maxSum=Math.max(sum,maxSum);
            right++;
        }
        return maxSum;
    }
}
