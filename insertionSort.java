import java.util.*;
public class insertionSort
{
    public static void inSort(int A[], int a)
    {
        for(int i=1;i<a;i++)
        {
            int temp=A[i];
            int j=i-1;
            while(j>=0 && A[j]>temp)
            {
                A[j+1]=A[j];
                j--;
            }
            A[j+1]=temp;
        }
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int a;
        int A[]= new int[100];
        System.out.println("enter the size of array: ");
        a=sc.nextInt();
        System.out.println("enter the array elements:");
        for(int i=0;i<a;i++)
        {
            A[i]=sc.nextInt();
        }
        inSort(A,a);
        System.out.println("Array after sorting");
        for(int i=0;i<a;i++)
        {
            System.out.println(A[i]);
        }
    }
}