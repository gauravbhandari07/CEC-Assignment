import java.util.*;
class Factorial
{
    public static int factorial(int n)
    {
        if(n<2) return 1;
        else return n*factorial(n-1);
    }   
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("enter the number: ");
        n=sc.nextInt();
        System.out.println("Factorial of "+n+" is: "+factorial(n));
    }
}
