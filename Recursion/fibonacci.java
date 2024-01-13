import java.util.*;
class fibonacci{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int a=findfibo(n);
       System.out.println(a);

    }
    public static int findfibo(int n)
    {
        if(n==0) //base condition    if(n<2) then return n
        {
            return 0;
        }
        if(n==1) //base condition
        {
            return 1;
        }
        return findfibo(n-1)+findfibo(n-2); //recurence relation
    }
}