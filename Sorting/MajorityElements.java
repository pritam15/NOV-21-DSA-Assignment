import java.util.Scanner;

public class MajorityElements{
   public static int[] BubbleSort(int[] arr){  
        int n = arr.length;  
        int i, j, temp; 
        boolean flag = false; 
        for (i = 0; i < n; i++){  
            flag = false;
            for (j = i + 1; j < n; j++){  
                if (arr[j] < arr[i]){  
    
                    temp = arr[i];  
                    arr[i] = arr[j];  
                    arr[j] = temp; 
                    flag = true; 
                }  
            }  
            if(!flag) break;
        }  
        return arr;
    }
    static int checkMajority(int[] nums){
        int majorityCount = nums.length/2;

        for (int num : nums) {
            int count = 0;
            for (int elem : nums) {
                if (elem == num) {
                    count += 1;
                }
            }

            if (count > majorityCount) {
                return num;
            }

        }

        return -1;    
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i]=sc.nextInt();
        }
         int arr2[] = BubbleSort(arr);
         System.out.println(checkMajority(arr2));
    }  
}