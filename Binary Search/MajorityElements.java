import java.util.Scanner;

public class MajorityElements {
    public static int majorityElement(int[] nums) {
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
       System.out.println("Enter the size of Array");
       int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Elements for the array");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
       System.out.println(majorityElement(arr));
    }
}

