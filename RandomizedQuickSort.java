import java.util.*;
public class RandomizedQuickSort
{
    public static int random(int A[], int l, int u)
    {
        int rand= (int)(Math.floor(Math.random()*(u-l+1)+l));
        int temp=A[rand];
        A[rand]=A[u];
        A[u]=temp;
    }
    public static int partition(int A[], int l, int u)
    {
        random(A, l, u);
        int pivot= A[u];
        int i=l-1;
         
        for(int j=l;j<u; j++)
        {
            if(A[j]<pivot)
            {
                i++;
                int temp=A[i];
                A[i]=A[j];
                A[j]=temp;
            }
        }
        i++;
        int temp=A[i];
        A[i]=pivot;
        A[u]=temp;
        return i;
    }
    public static void quickSort(int A[], int l, int u)
    {
        if(l<u)
        {
            int pind= partition(A, l, u);
            quickSort(A, l, pind-1);
            quickSort(A, pind+1, u);
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
        quickSort(A,0, a-1);
        System.out.println("Array after sorting");
        for(int i=0;i<a;i++)
        {
            System.out.println(A[i]);
        }
    }
}
