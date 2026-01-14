package twoPointers;

import org.testng.annotations.Test;

import java.util.Arrays;

public class ThreeSumClosestTest {

    @Test
    public void test1(){
        int[] nums ={-1,2,1,-4};
        int target =1;
        System.out.println(closestSum(nums,target));
    }

    @Test
    public void test2(){
        int[] nums ={0,0,0};
        int target =1;
        System.out.println(closestSum(nums,target));
    }

    @Test
    public void test3(){
        int[] nums ={10,20,30,40,50,60,70,80,90};
        int target =1;
        System.out.println(closestSum(nums,target));
    }

    private int closestSum(int[] nums, int target) {
        int result=Integer.MAX_VALUE;
        int sum=0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2 ; i++) {
            int j=i+1;
            int k = nums.length-1;
            while(j< k) {
                sum = nums[i] + nums[j] + nums[k];
                if (Math.abs(target - sum) < Math.abs(target - result)) result = sum;
                if(sum-target>0)k--;
                else j++;
            }
        }
        return result;
    }
}
