package intervals;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInervalsTest {

    @Test
    public void test1(){
        int[][] intervals = {{1,3},{6,9}};
        int[] newInterval = {2,5};
        insertInterval(intervals,newInterval);
    }

    @Test
    public void test2(){
        int[][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] newInterval = {2,5};
        insertInterval(intervals,newInterval);
    }

    @Test
    public void test3(){
        int[][] intervals = {{1,3},{6,9}};
        int[] newInterval = {4,5};
        insertInterval(intervals,newInterval);
    }

    private void insertInterval(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        for(int[] slot :intervals){
            if(slot[0]>newInterval[1]){
               list.add(newInterval);
               newInterval=slot;
            }else if(slot[1]<newInterval[0]) list.add(slot);
            else{
                newInterval[0]= Math.min(slot[0], newInterval[0]);
                newInterval[1]= Math.max(slot[1], newInterval[1]);
                }
            }
        list.add(newInterval);
        System.out.println(Arrays.deepToString(list.toArray()));
    }

}
