import java.util.*;
class ProductOfDigits{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int a=prodDigit(n);
        System.out.println(a);

    }
    public static int prodDigit(int n)
    {
        if(n%10==n)
        {
            return n;
        }
        return (n%10) * prodDigit(n/10) ;
    }
}