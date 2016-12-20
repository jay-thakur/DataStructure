package Array;

class AllMethods {

    /**
     * @param arr array of integers
     * @param key element to be search
     * @return an int/-1
     */
    int findElementInUnsortedArray(int[] arr, int key){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    /**
     * @param arr array of integers
     * @param key value to insert
     * @return arr
     */
    int[] insertInUnsortedArray(int[] arr, int key){
        arr[5] = key;
        return arr;
    }

    /**
     * @param arr to print
     */
    void printArray(int[] arr){
        for (int temp:arr) {
            System.out.print(temp+" ");
        }
    }

    int minElement(int[] arr){
        int min = arr[0];
        for (int temp:arr) {
            if (min > temp)
                min = temp;
        }
        return min;
    }
}
