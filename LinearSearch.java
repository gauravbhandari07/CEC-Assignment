import java.util.*;
class LinearSearch
{
    public static int lSearch(int A[],int n)
    {
        for(int i=0;i<A.length;i++)
        {
            if(A[i]==n) return i;
        }
        return -1;
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
        System.out.println("enter the element to be searched:");
        n=sc.nextInt();
        int pos=lSearch(A,n);
        if(pos==-1) System.out.println("Element not found");
        else System.out.println("element found at "+(pos+1)+" position");
    }
}