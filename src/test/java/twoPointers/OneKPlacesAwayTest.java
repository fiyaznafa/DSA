package twoPointers;

import org.testng.annotations.Test;

public class OneKPlacesAwayTest {

    @Test
    public void test1(){
        int[] nums ={1,0,0,0,1,0,0,1};
        int k=2;
        System.out.println(kPlacesAway(nums,k));
    }

    @Test
    public void test2(){
        int[] nums ={1,0,0,1,0,1};
        int k=2;
        System.out.println(kPlacesAway(nums,k));
    }

    @Test
    public void test3(){
        int[] nums ={1,1,1,1,1,1};
        int k=0;
        System.out.println(kPlacesAway(nums,k));
    }

    @Test
    public void test4(){
        int[] nums ={0,0,0,1,0,1};
        int k=2;
        System.out.println(kPlacesAway(nums,k));
    }

    private boolean kPlacesAway(int[] nums,int k) {
        int left=0,right=0;
        while(right<nums.length && nums[right]!=1)right++;
        left=right;
        right++;

        while(right< nums.length){
            if(nums[right]==1){
                if(right-left<=k)return false;
                left=right;
            }
            right++;
        }
        return true;
    }
}
