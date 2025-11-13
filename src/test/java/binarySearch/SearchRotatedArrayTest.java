package binarySearch;

import org.testng.annotations.Test;

public class SearchRotatedArrayTest {

    @Test
    public void test1(){
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(searchArray(nums,4));
    }

    @Test
    public void test3(){
        int[] nums = {4,5,6,7,0,1,2,3};
        System.out.println(searchArray(nums,0));
    }

    @Test
    public void test4(){
        int[] nums = {1};
        System.out.println(searchArray(nums,0));
    }

    private int searchArray(int[] nums, int target) {
        int low=0,high= nums.length-1,mid;
        while(low<=high){
            mid=low +((high-low)/2);
            if(nums[mid]==target)return mid;

            if(nums[low]<=nums[mid]){
                if(nums[low]<=target && nums[mid]>target)
                    high=mid-1;
                else
                    low=mid+1;
            }
            else{
                if(nums[mid]<target && target<=nums[high])
                    low=mid+1;
                else
                    high=mid-1;
            }
        }
        return -1;
    }
}
