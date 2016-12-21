package Array;

/**
 * A class which contains all the Operations in Sorted Array
 */
public class OperationInSortedArray {

    public static void main(String[] args) {

        int[] arr = {1,3,5,9,16};
        int n = arr.length - 1;
        int key = 3;

        System.out.println("********** Binary Search Using Recursion **********");

        int index = new AllMethods().binarySearchWithRecursion(arr, 0, n, key);

        if (index == -1)
            System.out.println("Element is not found.");
        else
            System.out.println("Element is found at position : "+(index+1));

        System.out.println("********** Binary Search Without Recursion **********");

        index = new AllMethods().binarySearch(arr, 0, n, key);

        if (index == -1)
            System.out.println("Element is not found.");
        else
            System.out.println("Element is found at position : "+(index+1));
    }
}
