//Binary Search for unsorted array
import java.util.*;
class Pair
{
    int first;
    int second;
    public Pair(int a, int b)
    {
        first=a;
        second=b;
    }
}

class Search_in_a_rotated_Array
{
    static ArrayList<Pair> a_arr;
    static void make_aux_array(int arr[],int n)
    {
        a_arr=new ArrayList<Pair>();
        int i;
        for(i=0;i<n;i++)
        {
            a_arr.add(new Pair(arr[i],i));
        }
        a_arr.sort((a,b)->(a.first + b.first));
    }
    static int binarySearch(int []arr , int n , int x)
    {
        int p=a_arr.size()-1;
        int i;
        for(i=0;i<a_arr.size();i++)
        {
          Pair e=a_arr.get(i);
          if(e.first>=x && e.second >=0)
          {
            p=i;
          }
        }
        if(p<n &&a_arr.get(p).first==x){
            return a_arr.get(p).second;
          }
          else
          {
            return -1;
          }
        
       
    }
     static void print(int arr[], int n, int x)
    {
        make_aux_array(arr,n);
        int res=binarySearch(arr,n,x);
        if(res==-1)
        {
            System.out.println(-1);
        }
        else{
            System.out.println("The element is present at "+res);
        }
    }
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
        System.out.println("Enter the element to be searched in the  array");
        int x=sc.nextInt();
        print(arr,n,x);
    }
}