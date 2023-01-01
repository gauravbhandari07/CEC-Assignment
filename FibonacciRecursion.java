import java.util.*;
public class FibonacciRecursion{
    public static void fibo(int a,int b,int count,int n)
    {
        if(count==(n-1)) System.out.print(" "+(a+b));
        else{
            int c=a+b;
            System.out.print(" "+c);
            fibo(b,c,count+1,n);
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a=0,b=1,c,count=2;
        System.out.println("Enter the no of terms:");
        n=sc.nextInt();
        System.out.print(a+" "+b);
        fibo(a,b,count,n);
    }    
}
