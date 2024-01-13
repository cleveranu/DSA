import java.util.*;
class SumofnNum{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int a=sum(n);
        System.out.println(a);

    }
    public static int sum(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        return n+sum(n-1);
    }
}