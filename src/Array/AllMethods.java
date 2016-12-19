package Array;

class AllMethods {

    /**
     * @param arr array of integers
     * @param key element to be search
     * @return an int/-1
     */
    int findElementInUnsortedArray(int[] arr, int key){
        for (int i=0; i<arr.length; i++){
            if (arr[i] == key){
                return i;
            }
        }
        return -1;
    }
}
