package Array;

/**
 * A class to perform search, insert & delete operation
 */
public class OperationInAnUnsortedArray {

    public static void main(String[] args) {
        int[] arr = {2, 24, 100, 6, 44};
        int key = 6;
        int keyPosition = new AllMethods().findElementInUnsortedArray(arr, key);

        if (keyPosition == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at position : "+(keyPosition+1));
        }

    }
}
