public class SmallestMissingElements {
    public static int BinarySearch(int[] arr, int start, int end)
    {
        
        if (start > end) {
            return start;
        }
 
        int mid = start + (end - start) / 2;

        if (arr[mid] == mid) {
            return BinarySearch(arr, mid + 1, end);
        }
        else {
            
            return BinarySearch(arr, start, mid - 1);
        }
    }
 
    public static void main(String[] args)
    {
        int[] arr = { 0, 1, 3,4, 5, 6 };
 
        int start = 0, end = arr.length - 1;
        System.out.println("The smallest missing element is " + BinarySearch(arr, start, end));
    }
}

