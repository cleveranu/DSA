import java.util.*;
class First_and_last_occurrences_of_x
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array");
        int i;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)//traversing array
        {
            if(arr[i]==i+1)
            {
                System.out.println(arr[i]);
                
            }
        }
    }
}
