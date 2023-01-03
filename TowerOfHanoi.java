import java.util.*;
public class TowerOfHanoi
{
    public static void tof(int n,int from, int to, int aux)
    {
        if(n==0) return;
        tof(n-1,from,aux, to);
        System.out.println("move disk: "+n+" from rod: "+from+" to rod: "+to);
        tof(n-1,aux,to,from);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter no of disks: ");
        n=sc.nextInt();
        tof(n,1,2,3);
    }
}
