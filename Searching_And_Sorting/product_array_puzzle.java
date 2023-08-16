import java.util.*;
class product_array_puzzle
{ 
    public static long totalproduct(int nums[], int x)
    {
        long totalproduct=1;
        for(int i=0;i<nums.length;i++)
        {
            if(i==x)
            {
                continue;
            }
            else
            {
                totalproduct*=nums[i];
            }
        }
        return totalproduct;
    }
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        
        int i;
        n=nums.length;
        long prod=1;
        long pa[]=new long[2000];
        for(i=0;i<n;i++)
        {
            pa[i]=totalproduct(nums,i);
        }
        
        return pa;
        
	} 
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter the elements of array");
        int i;
        for(i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        
        
        long a[]=productExceptSelf(nums,n);
        System.out.println("The array elemets are: ");
       
        for(int j=0;j<n;j++)
        {
            System.out.println(a[j]);
        }
    }
}