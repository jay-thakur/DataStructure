package Array;

/**
 * A class which contains all the Operations in Sorted Array
 */
public class OperationInSortedArray {

    public static void main(String[] args) {

        int[] arr = {1,3,5,9,16};
        int n = arr.length;
        int key = 3;

        int index = new AllMethods().binarySearch(arr, 0, n, key);

        if (index == -1)
            System.out.println("Element is not found.");
        else
            System.out.println("Element is found at position : "+(index+1));
    }
}
