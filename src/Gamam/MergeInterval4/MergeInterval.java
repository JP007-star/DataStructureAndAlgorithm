package Gamam.MergeInterval4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeInterval {
    public static void main(String[] args) {
        // Test case
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};

        // Call the merge function
        int[][] merged = merge(intervals);

        // Print the merged intervals
        System.out.println("Merged Intervals: ");
        for (int[] interval : merged) {
            System.out.println(Arrays.toString(interval));
        }
    }


    public static int[][] merge(int[][] intervals){
        if(intervals.length<1){
            return new int[0][];
        }

        // Step 1: Sort intervals based on the starting times

        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));

        // Result list to store merged intervals
        List<int []> mergeInterval=new ArrayList<>();

        // Add the first interval to the result
        int[] currentInterval=intervals[0];
        mergeInterval.add(currentInterval);

        // Step 2: Traverse the intervals and merge if necessary

        for(int[] interval: intervals){

            // Compare the end of the current interval with the start of the next
            if(interval[0]<=currentInterval[1]){
                // Overlapping intervals, so merge them
               currentInterval[1]=Math.max(currentInterval[1],interval[1]);
            }
            else {
                // Non-overlapping interval, so add it to the result
                currentInterval=interval;
                mergeInterval.add(currentInterval);
            }




        }


        return mergeInterval.toArray(new int[mergeInterval.size()][]);

    }
}
