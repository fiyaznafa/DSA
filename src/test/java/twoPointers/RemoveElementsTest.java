package twoPointers;

import org.testng.annotations.Test;

import java.util.Arrays;

public class RemoveElementsTest {

    @Test
    public void test1(){
        int[] nums = {3,2,2,3};
        System.out.println(removeElement(nums,3));
    }

    @Test
    public void test2(){
        int[] nums = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(nums,2));
    }

    @Test
    public void test3(){
        int[] nums = {0,0};
        System.out.println(removeElement(nums,0));
    }

    private int removeElement(int[] nums, int val) {
        int left=0,right=0;
        while(right< nums.length){
            while (right< nums.length && nums[right]==val)right++;
            if(right< nums.length && nums[right]!=val)
                nums[left++]=nums[right++];
        }
        return left;
    }
}
