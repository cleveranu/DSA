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
        System.out.println("Enter the element whose occurence is to be found");
        int x=sc.nextInt();
        //we need to sort the array so can use any sorting but here i am using inbuilt function
        Arrays.sort(arr);
        int first_occ=-1;
        int last_occ=-1;
        //applying binary serach to find first_occ
        int start=0, end=n-1;
        while(start <= end) 
        {
            int mid = start + (end-start)/2;
            if(arr[mid] == x)
             {
                first_occ = mid;
                end = mid-1;
            } else if(x < arr[mid])
            {
                end = mid - 1;
            }
            else
             {
                start = mid + 1;
             }
        }
        //now last occ
        start=0;
        end=n-1;
        while(start <= end) 
        {
            int mid = start + (end-start)/2;
            
            if(arr[mid] == x) 
            {
                last_occ = mid;
                start = mid+1;
            } 
            else if(x < arr[mid]) 
            {
                end = mid - 1;
            } 
            else 
            {
                start = mid + 1;
            }
        }
        System.out.println("First occurence of element " + x+ " is "+ first_occ);
        System.out.println("LAst occurence of element " + x+ " is "+ last_occ);
    }
}