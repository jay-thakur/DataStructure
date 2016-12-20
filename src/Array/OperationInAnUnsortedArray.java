package Array;

/**
 * A class to perform search, insert & delete operation
 */
public class OperationInAnUnsortedArray {

    static AllMethods allMethods = new AllMethods();

    public static void main(String[] args) {
        int[] arr = new int[6];
        arr[0] = 2;
        arr[1] = 24;
        arr[2] = 100;
        arr[3] = 6;
        arr[4] = 44;

        System.out.println("array size is : "+arr.length);

        System.out.println("********** Search Implementation **********");

        int key = 10;
        int keyPosition = allMethods.findElementInUnsortedArray(arr, key);

        if (keyPosition == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at position : "+(keyPosition+1));
        }

        System.out.println("---------- Insert Implementation ----------");
        arr = allMethods.insertInUnsortedArray(arr,50);
        System.out.println("-- After Inserting --");
        allMethods.printArray(arr);

    }
}
