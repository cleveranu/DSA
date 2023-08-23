import java.util.*;
class duplicates_in_string
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int i;
        char ch;
        System.out.println("Enter the string");
        String s= sc.nextLine();
        int l=s.length();
        s=s.toLowerCase();
        int temp[]=new int[26];
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
             //  This is subtracting the ASCII value of 'a' from the ASCII value of the character stored in the variable ch. 
             //This effectively maps the character to a zero-based index. For instance, if ch contains the character 'c', 
             //then 'c' - 'a' would result in 2,because the ASCII value of 'c' is 99 and the ASCII value of 'a' is 97.
            
             
                temp[ch-'a']++; 
             
        

        }
        System.out.println("Duplicate character present in string are");
        for(int j=0;j<26;j++)
        {
            if(temp[j]>1)
            {
                System.out.println((char) ('a' + j) + ": " + temp[j]);
            }
        }

    }
}
