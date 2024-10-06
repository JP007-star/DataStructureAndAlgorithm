package Gamam.TwoHeap7;

import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.TreeMap;

public class FindRightInterval {
    public static void main(String[] args) {

        int[][] intervals1 = {{1, 2}};
        int[][] intervals2 = {{3, 4}, {2, 3}, {1, 2}};
        int[][] intervals3 = {{1, 4}, {2, 3}, {3, 4}};

        System.out.println(Arrays.toString(findRightInterval(intervals1))); // Output: [-1]
        System.out.println(Arrays.toString(findRightInterval(intervals2))); // Output: [-1, 0, 1]
        System.out.println(Arrays.toString(findRightInterval(intervals3))); // Output: [-1, 2, -1]
    }

    private static int[] findRightInterval(int[][] intervals) {
        int[] result=new int[intervals.length];

        TreeMap<Integer,Integer> map=new TreeMap<>();

        for(int i=0;i<intervals.length;i++){
            map.put(intervals[i][0],i);
        }



        for (int i=0;i<intervals.length;i++){
            Integer key=map.ceilingKey(intervals[i][1]);
            if(key!=null){
                result[i]=map.get(key);
            }
            else {
                result[i]=-1;
            }
        }


        return  result;
    }
}
