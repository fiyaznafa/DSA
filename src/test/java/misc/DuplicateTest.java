package misc;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class DuplicateTest {

    @Test
    public void test1(){
        int[] nums ={1,3,4,2,2};
        findDuplicate(nums);
    }

    @Test
    public void test2(){
        int[] nums ={3,1,3,4,2};
        findDuplicate(nums);
    }

    @Test
    public void test3(){
        int[] nums ={3,3,3,3,3};
        findDuplicate(nums);
    }

    private void findDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
            if(map.get(n)==2) {
                System.out.println(n);
                break;
            }
        }
    }

    private void findDuplicateSlowFast(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow!=fast);

        slow = nums[0];
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }
        System.out.println(slow);
    }



}
