package twoPointers;

import org.testng.annotations.Test;


public class RemoveDuplicatesTest {
    @Test
    public void test1(){
        int[] nums = {1,1,2};
        System.out.println(removeDuplicate(nums));
    }

    @Test
    public void test2(){
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicate(nums));
    }

    public int removeDuplicate(int[] nums){
        int left=0,right=0;
        while(right<nums.length){
            if(nums[left]!=nums[right]){
                nums[++left]=nums[right];
            }
            right++;
        }
        return left+1;
    }

}
