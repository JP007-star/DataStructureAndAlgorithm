package problems;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GenerateBinaryNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=scanner.nextInt();
        String[] result=generateBinaryNumbers(num);
        for (String s:result){
            System.out.println(s);
        }
    }

    private static String[] generateBinaryNumbers(int num) {
        String[] result=new String[num];
        Queue<String> q=new LinkedList<>();
        q.offer("1");
        for(int i=0;i<num;i++){
            result[i]=q.poll();
            String n1=result[i]+"0";
            String n2=result[i]+"1";
            q.offer(n1);
            q.offer(n2);
        }
      return  result;
    }
}
