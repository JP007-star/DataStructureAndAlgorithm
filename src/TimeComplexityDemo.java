/*
 * @project DataStructureAndAlgorithm
 * @fileName TimeComplexityDemo
 * @author Jaya Prasad.M --> jaya_muthukrishnan
 * @email jaya_muthukrishnan@thbs.com
 * @date 23 11 2021 10:33 PM
 */

public class TimeComplexityDemo {
    public static void main(String[] args) {
        double now=System.currentTimeMillis();
        System.out.println(findSum(99999));
        System.out.println("Time Taken: "+(System.currentTimeMillis()-now)+" milliseconds");
    }

    private static int findSum(int n) {
        return n*(n+1)/2;
    }
//    private static int findSum(int n) {
//        int sum=0;
//        for(int i=1;i<=n;i++){
//            sum+=i;
//        }
//        return sum;
//    }
}
