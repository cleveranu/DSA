import java.util.*;
class BinarySearch{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int []arr={7,9,10,12,13};
        int a=search(arr,n,0,arr.length-1);
        System.out.println(a != -1 ? "Element found at index " + a : "Element not found");

    }
    public static int search(int []arr,int n,int s, int e)
    {
        if(s>e) //important
        {
            return -1;
        }
        int mid=s+(e-s)/2;
        if(n==arr[mid])
        {
            return mid;
        }
        else if(n>arr[mid])
        {
            return search(arr,n,mid+1,e);
        }
       
            return search(arr,n,s,mid-1);
        
     
    }
}