package binarySearch;

import org.testng.annotations.Test;

public class InsertPositionTest {

    @Test
    public void test1(){
        int[] nums={1,3,5,6};
        int target = 5;
        System.out.println(insertPosition(nums,target));
    }

    @Test
    public void test2(){
        int[] nums={1,3,5,6};
        int target = 2;
        System.out.println(insertPosition(nums,target));
    }

    @Test
    public void test3(){
        int[] nums={1,3,5,6};
        int target = 7;
        System.out.println(insertPosition(nums,target));
    }

    private int insertPosition(int[] nums, int target) {
        int start = 0, end = nums.length-1;
        int mid =0;

        while(start<=end){
            mid = start +((end-start)/2);
            if(nums[mid]==target)return mid;
            if(nums[mid]<target)start = mid+1;
            else end= mid-1;
        }
        return start;
    }
}
