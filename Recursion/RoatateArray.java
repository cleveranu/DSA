import java.util.*;
//if arr[s]<= arr[mid] means array is sorted 
//now also chck if key is in this range key>= arr[s] && <=arr[mid]
//now we can say end=m-1;
//else mid+1
//if key is grater than = mid elemnet and less than arr[end] s=m+1
class RoatateArray{
    public static void main(String[] args)
    {
        int []arr={5,6,7,8,9,1,2,3};
        System.out.println(search(arr,8,0,arr.length-1));
    }
    public static int search(int arr[], int target, int s, int e)
    {
        if(s>e)
        {
            return -1;
        }
        int m=s+(e-s)/2;
        if(arr[m]==target)
        {
            return m;
        }
        if(arr[s]<=arr[m])
        {
            if(target >=arr[s] && target<=m)
            {
                search(arr,target,s,m-1);
            }
            else
            {
                return search(arr,target,m+1,e);
            }
        }
        if(target>= arr[m] && target<=arr[e])
        {
            return search(arr,target,m+1,e);
        }
        return search(arr,target,s,m-1);
    }
}