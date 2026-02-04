package problems;

public class Fibinacci {


    public static void main(String[] args) {

        System.out.println(fibonacci(10));
        fibonacci();

    }


    public static void fibonacci(){
        int terms=11;
        int first=0;
        int second=1;

        for(int i=1;i<terms;i++){
            System.out.print(first+" ");
            int res=first+second;
            first=second;
            second=res;
        }
    }


    public static int fibonacci(int n){
        if(n<=1)
            return n;

        return fibonacci(n-1)+fibonacci(n-2);
    }







}
