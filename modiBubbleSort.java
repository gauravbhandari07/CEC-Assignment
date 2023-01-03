import java.util.*;
class modiBubbleSort{
    public static void bsort(int A[],int a)
    {
        int flag=0;
        for(int i=0;i<a && flag==0;i++)
        {
            flag=1;
            for(int j=0;j<a-i-1;j++)
            {
                if(A[j]>A[j+1])
                {
                    int temp=A[j];
                    A[j]=A[j+1];
                    A[j+1]=temp;
                    flag=0;
                }
            }
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
        bsort(A, a);
        System.out.println("Array after sorting");
        for(int i=0;i<a;i++)
        {
            System.out.println(A[i]);
        }
    }
}