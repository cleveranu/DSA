import java.util.*;
class NumPrint{
    public static void main(String args[])
    {
        // Scanner sc= new Scanner(System.in);
        // System.out.println("Enter a number");
        // int n=sc.nextInt();
        num(5);
     

    }
    public static void num(int n)
    {
        if(n==0)
        {
            return ;
        }
        num(n-1);
        System.out.println(n);
       
        
    }
}