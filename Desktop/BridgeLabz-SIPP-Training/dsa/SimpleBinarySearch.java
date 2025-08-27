public class SimpleBinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return mid; 
            } else if (arr[mid] < target) {
                low = mid + 1; 
            } else {
                high = mid - 1; 
            }
        }

        return -1; 
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 12, 23, 45, 78}; 
        int target = 45;

        int result = binarySearch(arr, target);

        if (result == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Found at index: " + result);
        }
    }
}
