import java.util.*;
public class Fibonacci{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a=0,b=1,c,count=2;
        System.out.println("Enter the no of terms:");
        n=sc.nextInt();
        System.out.print(a+" "+b);
        while(count<n)
        {
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
            count++;
        }
    }    
}
