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

    /**
     * method to search in sorted array i.e; binarySearch
     * @param arr array of integers
     * @param low arr min index
     * @param high arr max index
     * @param key element to be search
     * @return binarySearch()
     */
    int binarySearchWithRecursion(int[] arr, int low, int high, int key){
        if (high < low)
            return -1;
        int mid = (low + high) / 2;
        if (key == arr[mid])
            return mid;
        if (key > arr[mid])
            return binarySearchWithRecursion(arr,(mid + 1), high, key);
        return binarySearchWithRecursion(arr, low, (mid - 1), key);
    }

    /**
     * method to search in sorted array i.e; binarySearch
     * @param arr array of integers
     * @param low arr min index
     * @param high arr max index
     * @param key element to be search
     * @return index value
     */
    int binarySearch(int[] arr, int low, int high, int key){
        while(low <= high){
            int mid = (low + high) / 2;
            if (key < arr[mid])
                high = mid - 1;
            else if (key > arr[mid])
                low = mid + 1;
            else
                return mid;
        }
        return -1;
    }
}
