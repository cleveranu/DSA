import java.util.*;

class IsomorphicStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        char ch, ch1;
        System.out.println("Enter the first string");
        String s = sc.nextLine();
        System.out.println("Enter the second string");
        String s1 = sc.nextLine();
        int l = s.length();
        int l1 = s1.length();
        s = s.toLowerCase();
        s1 = s1.toLowerCase();
        if (l != l1) {
            System.out.println("Not isomorphic strings");
        } else {
            int temp[] = new int[256];
            int temp1[] = new int[256];
            boolean isIsomorphic = true;

            for (i = 0; i < l; i++) {
                ch = s.charAt(i);
                ch1 = s1.charAt(i);

                if (temp[ch] != temp1[ch1]) {
                    isIsomorphic = false;
                    System.out.println("Not isomorphic");
                    break;
                }
                temp1[ch1-'a']++;
                temp[ch-'a']++;
            }

            if (isIsomorphic) {
                System.out.println("Isomorphic strings");
            }
        }
    }
}
