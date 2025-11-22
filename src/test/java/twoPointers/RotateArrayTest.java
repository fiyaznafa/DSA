package twoPointers;

import org.testng.annotations.Test;

import java.util.Arrays;

public class RotateArrayTest {

    @Test
    public void test1(){
        int[] nums ={0,1,2,3,4,5,6,7};
        int k=3;
        rotateArray(nums,k);
        rotateArraySwap(nums,k);
    }

    @Test
    public void test2(){
        int[] nums ={-1,-100,3,99};
        int k=3;
        rotateArray(nums,k);
        rotateArraySwap(nums,k);
    }

    @Test
    public void test3(){
        int[] nums ={1,2,3,4};
        int k=2;
        rotateArray(nums,k);
        rotateArraySwap(nums,k);
    }

    @Test
    public void test4(){
        int[] nums ={1,2,3,4};
        int k=5;
        rotateArray(nums,k);
        rotateArraySwap(nums,k);
    }

    /*
        1,2,3,4,5,6,7
        5,6,7,1,2,3,4

     */

    private void rotateArray(int[] nums, int k) {
        int n = nums.length;;
        k=k%n;
        int[] res = new int[n];
        for(int i = k; i <n; i++) {
            res[i]=nums[i-k];
        }
        for (int i = 0; i < k; i++) {
            res[i]=nums[n-k+i];
        }
        System.arraycopy(res, 0, nums, 0, n);


        System.out.println(Arrays.toString(res));
    }

    private void rotateArraySwap(int[] nums, int k) {
        int n = nums.length;;
        k=k%n;
        swapArray(nums,n-k-1);
        swapArray(nums,n-1);
        swapArray(nums,k-1);
        System.out.println(Arrays.toString(nums));
    }

    private void swapArray(int[] nums, int right) {
        int left=0,temp;
        while(left<right){
            temp=nums[left];
            nums[left]=nums[right];
            nums[right--]=temp;
            left++;
        }
    }
}
