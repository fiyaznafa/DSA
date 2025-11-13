package misc;

import org.testng.annotations.Test;

import java.util.PriorityQueue;
import java.util.Random;

public class KLargestElementTest {

    @Test
    public void test1(){
        int[] nums ={3,2,1,5,6,4};
        int k=2;
        System.out.println(findKLargestNo(nums,k));
    }

    @Test
    public void test2(){
        int[] nums ={3,2,3,1,2,4,5,5,6};
        int k=4;
        System.out.println(findKLargestNo(nums,k));
    }

    private int findkLargest(int[] nums, int k) {
       return selectkLargest(nums,0,nums.length-1, nums.length-k);
    }

    private int selectkLargest(int[] nums, int left, int right, int k) {
        if (left == right) return nums[left];

        int randomIndex = left+ new Random().nextInt(right-left+1);
        swapNumbers(nums,randomIndex,right);

        int pivotIndex = partition(nums, left, right);

        if(pivotIndex==k)return nums[pivotIndex];
        else if(pivotIndex>k) return selectkLargest(nums, left, pivotIndex-1,k);
        else return selectkLargest(nums, pivotIndex+1, right,k);
        }

    private int partition(int[] nums, int left, int right) {
        int pivot = nums[right];
        int i=left;

        for (int j = left; j < right; j++) {
            if(nums[j]<pivot) {
                swapNumbers(nums, i, j);
                i++;
            }
        }
        swapNumbers(nums,i,right);
        return i;
    }


    private void swapNumbers(int[] nums,int left,int right){
        int temp = nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
    }




    private int findKLargestNo(int[] nums,int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(k);
        for (int n : nums) {
            queue.offer(n);
            if(queue.size()>k)
                queue.poll();
        }
        return queue.peek();
    }
}
