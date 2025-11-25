package twoPointers;

import org.testng.annotations.Test;

public class LargestSumSubArrayTest {

    @Test
    public void test1(){
        int[] nums ={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(largestSubarraySum(nums));
    }

    @Test
    public void test2(){
        int[] nums ={5,4,-1,7,8};
        System.out.println(largestSubarraySum(nums));
    }

    @Test
    public void test3(){
        int[] nums ={-1};
        System.out.println(largestSubarraySum(nums));
    }

    private int largestSubarraySum(int[] nums) {
        int right=0,sum=0, maxSum=Integer.MIN_VALUE;
        while(right< nums.length){
            sum+=nums[right];
            maxSum=Math.max(sum,maxSum);
            if(sum<0)sum=0;
            right++;
        }
        return maxSum;
    }

}
