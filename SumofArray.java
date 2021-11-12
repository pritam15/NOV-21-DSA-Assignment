import java.util.*;
class Solution1{
   
    public static int sumOfArray(int[] a, int n) {
        if (n == 0)
            return a[n];
        else
            return a[n] + sumOfArray(a, n-1);
    }
}

public class SumofArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(Solution1.sumOfArray(arr,size-1));
    }
}
