/*
Given a string "my name is kevin". Find out frequency of each characters using java 8



given a map where key is file name and value is file size...find the file names of two largest file using java 8.
 */

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyChar {
    public static void main(String[] args) {
        String input="my name is kevin";


        Map<Character,Long> frequency=input.chars().mapToObj(c->(char) c ).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));




        Map<String,Integer> files=new HashMap<>();
        files.put("file1.txt", 30);
        files.put("file2.txt",40);
        files.put("file3.txt",50);


        List<String> largestFiles=files.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(2).map(Map.Entry::getKey).collect(Collectors.toList());


        System.out.println(largestFiles);

    }
}

