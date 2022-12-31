import java.util.*;
class BinarySearch
{
    public static int bsearch(int A[], int n, int l, int u)
    {
        int m=(u+l)/2;
        if(l>u||n>A[u]||n<A[0]) return -1;
        else if(A[m]==n)
        {
            return m+1;
        }
        else if(A[m]>n)
            return bsearch(A,n,l,m);
        else
            return bsearch(A,n,m,u);
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
        int pos= bsearch(A,n,0,a-1);
        if(pos==-1) System.out.println("Element not found");
        else System.out.println("element found at "+pos+" position");
    }
}