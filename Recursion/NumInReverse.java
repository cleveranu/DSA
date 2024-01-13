import java.util.*;
class NumInReverse{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int a=rev(n);
        System.out.println(a);

    }
    public static int rev(int n)
    {
        if(n==1)
        {
            return 1;
        }
        System.out.println(n);
        return rev(n-1);
        
    }
}