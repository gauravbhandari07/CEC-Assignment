import java.util.*;
public class CountSort
{
    public static int maximum(int A[], int n)
    {
        int max=A[0];
        for(int i=0;i<n;i++)
        {
            if(max<A[i])
                max=A[i];
        }
        return max;
    }
    public static int counts(int A[], int a, int n)
    {
        int c=0;
        for(int i=0;i<a;i++)
        {
            if(A[i]==n)
                c++;
        }
        return c;
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int a, n;
        int A[]= new int[100];
        System.out.println("enter the size of array: ");
        a=sc.nextInt();
        System.out.println("enter the array elements:");
        for(int i=0;i<a;i++)
        {
            A[i]=sc.nextInt();
        }
        int max= maximum(A,a);
        int count[]=new int[max+1];
        for(int i=0;i<=max;i++)
        {
            count[i]= counts(A, a, i);
        }
        int sum=0;
        for(int i=0;i<=max;i++)
        {
            sum=sum+count[i];
            count[i]=sum;
        }
        int B[]=new int[a];
        for(int i=a-1;i>=0;i--)
        {
            count[A[i]]--;
            B[count[A[i]]]=A[i];
        }
        for(int i=0;i<a;i++)
        {
            A[i]=B[i];
        }
        System.out.println("Array after sorting");
        for(int i=0;i<a;i++)
        {
            System.out.println(A[i]);
        }
    }
}
