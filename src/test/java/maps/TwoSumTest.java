package maps;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class TwoSumTest {

    @Test
    public void test1(){
        int[] nums = {2,7,11,15};
        int target =9;
        Assert.assertEquals( twoSum(nums,target),new int[]{0,1});
    }

    @Test
    public void test2(){
        int[] nums = {3,2,4};
        int target =6;
        Assert.assertEquals( twoSum(nums,target),new int[]{1,2});
    }

    @Test
    public void test3(){
        int[] nums = {3,3};
        int target =6;
        Assert.assertEquals( twoSum(nums,target),new int[]{0,1});
    }

    private int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i< nums.length;i++){
            if(map.containsKey(target-nums[i])){
               return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
