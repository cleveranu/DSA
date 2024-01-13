import java.util.*;

class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {12, 5, 8, 9, 6, 57};
        int key = 50;
        System.out.println(search(arr, key, 0));
    }

    public static boolean search(int arr[], int key, int index) {
        if (index >= arr.length) {
            // If the index goes beyond the array length, the element is not found
            return false;
        }

        if (arr[index] == key) {
            // Element found at the current index
            return true;
        }

        // Recursive call with the next index
        return search(arr, key, index + 1);
    }
}

//IF QUESTION IS ASKED TO RETURN A LIST AND ARRAY LIST IS GIVEN
// static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list)
// {
//     if(index==arr.length)
//     {
//         return list
//     }
//     if(arr[index]==target)
//     {
//         list.add(index);
//     }
//     return findAllIndex(arr,target,index+1,list);
// }