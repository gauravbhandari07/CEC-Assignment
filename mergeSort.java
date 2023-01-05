import java.util.*;
public class mergeSort
{
    public static void conquer(int A[],int s, int mid, int e)
    {
        int merged[]= new int[e-s+1];
        int ind1 = s;
        int ind2 = mid+1;
        int x =  0;

        while(ind1 <= mid && ind2 <= e)
        {
            if(A[ind1] <= A[ind2])
                merged[x++] = A[ind1++];
            else
                merged[x++] = A[ind2++];
        }
        while(ind1 <= mid)
            merged[x++]=A[ind1++];
        while(ind2<=e)
            merged[x++]=A[ind2++];

        for(int i=0, j=s; i<merged.length;i++,j++)
        {
            A[j]=merged[i];
        }
    }
    public static void divide(int A[], int si, int ei)
    {
        if(si >= ei)   return;
        int mid= si+(ei-si)/2;
        divide(A, si, mid);
        divide(A, mid+1, ei);
        conquer(A, si, mid, ei);
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
        divide(A, 0, a-1);
        System.out.println("Array after sorting");
        for(int i=0;i<a;i++)
        {
            System.out.println(A[i]);
        }
    }
}