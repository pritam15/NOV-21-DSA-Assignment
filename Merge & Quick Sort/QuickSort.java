public class QuickSort {
	static int quick(int[] arr, int start, int end) {
		int pivot = arr[start];
		int i =start;
		int j = end;
		
		while(i<j) {
			while(arr[i]<pivot) {
				i++;
			}
			while(arr[j]>pivot) {
				j--;
			}
			if(i<j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = pivot;
		pivot = arr[j];
		arr[j] = temp;
		
		return j;
	}
    static void sort(int arr[], int starrrt,int end) {
		if(starrrt<end) {
			int pivot = quick(arr,starrrt,end);
			sort(arr,starrrt,pivot-1);
			sort(arr,pivot+1,end);
		}
	}

    public static void main(String[] args) {
        int[] arr= {50,2,75,6,50,85,60,55,10};
        sort(arr,0,arr.length-1);
        
        for(Integer a: arr) {
            System.out.print(a + " ");
        }
   }
}