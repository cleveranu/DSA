import java.util.*;
class ReverseofNum{
   
   static int sum=0;
    public static void rev(int n)
    {
        if(n==0)
        {
            return ;
        }
        int rev = n%10;
        sum=sum*10+rev;
        rev(n/10);
    }
    public static void main(String []args)
    {
        rev(1234);
        System.out.println(sum);
    }
}