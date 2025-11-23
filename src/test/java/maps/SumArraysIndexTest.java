package maps;

import org.testng.annotations.Test;

public class SumArraysIndexTest {

    @Test
    public void test1(){
            int[] arr = {2, 4, 1, 3, 5};
            int[][] queries = {{1, 3}, {0, 4}, {2, 2}};
            findSum(arr, queries);
    }

    private int[] findSum(int[] arr, int[][] queries) {
        int[] sumArray = new int[arr.length];
        int[] res =  new int[queries.length];
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            sumArray[i]=sum;
        }
        for(int i=0;i< queries.length;i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            sum = sumArray[right]-sumArray[left]+arr[left];
            res[i]=sum;
        }

        return res;

    }




}
