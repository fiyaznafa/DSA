package misc;

import org.testng.annotations.Test;

public class PivotIndexTest {
    //https://leetcode.com/problems/find-pivot-index/
    @Test
    public void test1(){
        int[] nums = {1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));
    }

    @Test
    public void test2(){
        int[] nums = {1,2,3};
        System.out.println(pivotIndex(nums));
    }

    @Test
    public void test3(){
        int[] nums = {2,1,-1};
        System.out.println(pivotIndex(nums));
    }

    private int pivotIndex(int[] nums) {
        int leftSum=0;
        int rightSum=0;
        for(int n:nums)rightSum+=n;
        for (int i = 0; i < nums.length; i++) {
            rightSum-=nums[i];
            if(leftSum==rightSum)return i;
            leftSum+=nums[i];
        }
        return -1;
    }


}
