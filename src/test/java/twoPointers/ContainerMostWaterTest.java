package twoPointers;

import org.testng.annotations.Test;

public class ContainerMostWaterTest {

    @Test
    public void test1(){
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxWaterInContainer(height));
    }

    @Test
    public void test2(){
        int[] height = {1,1};
        System.out.println(maxWaterInContainer(height));
    }

    @Test
    public void test3(){
        int[] height = {1,8,8,1,1};
        System.out.println(maxWaterInContainer(height));
    }

    @Test
    public void test4(){
        int[] height = {1,8,0,1,1};
        System.out.println(maxWaterInContainer(height));
    }

    private int maxWaterInContainer(int[] height) {
        int left=0,right= height.length-1, water=0,max = 0;
        while(left<right){
            water = Math.min(height[left], height[right])*(right-left);
            if(height[left]<height[right])left++;
            else right--;
            max=Math.max(water,max);
        }
        return max;
    }


}
