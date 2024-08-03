import java.util.*;
public class MissingNumber {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long sum=0;
        long temp=n-1;
        while(temp!=0){
            temp--;
            long x=sc.nextLong();
            sum+=x;
        }
        n=(n*(n+1))/2;
        System.out.print(n-sum);
    }
}