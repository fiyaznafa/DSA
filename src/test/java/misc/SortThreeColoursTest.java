package misc;

import org.testng.annotations.Test;

import java.util.Arrays;

public class SortThreeColoursTest {

    @Test
    public void test1(){
        int[] nums ={2,0,2,1,1,0};
        sortArray(nums);
    }

    @Test
    public void test2(){
        int[] nums ={2,0,1};
        sortArray(nums);
    }

    @Test
    public void test3(){
        int[] nums ={1,2,0};
        sortArray(nums);
    }

    private void sortArray(int[] nums) {
        int low = 0, mid=0, high = nums.length-1,temp=0;
        while(mid<=high){
            if(nums[mid]==0){
                temp=nums[mid];
                nums[mid++]=nums[low];
                nums[low++]=temp;
            }
            else if(nums[mid]==2){
                temp=nums[mid];
                nums[mid]=nums[high];
                nums[high--]=temp;
            }
            else mid++;
        }
        System.out.println(Arrays.toString(nums));
    }
}
