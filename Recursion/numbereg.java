import java.util.*;
class numbereg{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
      
        num(n);
    }
    public static void num(int n)
    {
        int i=1;
        for(i=1;i<=n;i++)
        {
            System.out.println(i);
        }
    }
}