import java.util.*;
class Factorial{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int a=fact(n);
        System.out.println(a);

    }
    public static int fact(int n)
    {
        if(n==1 || n==0)
        {
            return 1;
        }
        return n*fact(n-1);
    }
}