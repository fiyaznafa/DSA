package intervals;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntevalsTest {

    @Test
    public void test1(){
        int[][] intervals  = {{1,3},{2,6},{8,10},{15,18}};
//        System.out.println(Arrays.deepToString(mergeIntervals(intervals)));
        System.out.println(Arrays.deepToString(mergeIntervalsII(intervals)));
    }

    @Test
    public void test2(){
        int[][] intervals  = {{1,4},{4,5}};
//        System.out.println(Arrays.deepToString(mergeIntervals(intervals)));
        System.out.println(Arrays.deepToString(mergeIntervalsII(intervals)));
    }

    @Test
    public void test3(){
        int[][] intervals  = {{4,7},{1,4}};
//        System.out.println(Arrays.deepToString(mergeIntervals(intervals)));
        System.out.println(Arrays.deepToString(mergeIntervalsII(intervals)));
    }

    private int[][] mergeIntervals(int[][] intervals) {
        Arrays.sort(intervals,(i,j)->Integer.compare(i[0],j[0]));
        List<int[]> list = new ArrayList<>();
        int[] interval = intervals[0];

        for (int[] newInterval : intervals){
            if(interval[1]>=newInterval[0]){
                list.remove(interval);
                interval[1]=Math.max(interval[1],newInterval[1]);
            }
            else interval= newInterval;
            list.add(interval);
        }
        return list.toArray(new int[][]{});
    }

    private int[][] mergeIntervalsII(int[][] intervals) {
        List<int[]> list = new ArrayList<>();
        int[] interval = intervals[0];

        for (int[] newInterval : intervals){
            if(interval[1]>=newInterval[0]){
                list.remove(interval);
                interval[1]=Math.max(interval[1],newInterval[1]);
            }
            else interval= newInterval;
            list.add(interval);
        }
        return list.toArray(new int[list.size()][]);
    }

}
