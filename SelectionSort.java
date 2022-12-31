import java.util.*;
class SelectionSort
{
    public static void ssort(int A[],int a)
    {
        for(int i=0;i<a-1;i++)
        {
            int temp=A[i];
            int pos=i;
            for(int j=i+1;j<a;j++)
            {
                if(A[j]<temp)
                {
                    temp=A[j];
                    pos=j;
                }
            }
            int temp1=A[pos];
            A[pos]=A[i];
            A[i]=temp1;
        }
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
        ssort(A, a);
        System.out.println("Array after sorting");
        for(int i=0;i<a;i++)
        {
            System.out.println(A[i]);
        }
    }
}