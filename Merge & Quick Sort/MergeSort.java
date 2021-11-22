import java.util.Scanner;

class Solution{
    public void Merge(int[] arr, int Start, int Mid, int End){
        int len = arr.length;
        int[] output = new int[len];
        int i = Start,j = Mid+1,k = 0;
        
        while(i <= Mid && j <= End){
           if(arr[i] < arr[j]){
               output[k] = arr[i];
               i++;
           }
           else{
               output[k] = arr[j];
               j++;
           }
           k++;
        }

        while(i <= Mid){
            output[k] = arr[i];
            i++;
            k++;
           }
        while(j <= End){
            output[k] = arr[j];
            j++;
            k++;
           }

        int m = 0;
        for(int n = Start; n <= End; n++){
            arr[n] = output[m];
            m++;
        }
    }

    public void mergeSort(int[] arr, int Start, int End){
        if(Start < End){
        int Mid = Start+(End - Start)/2;
        mergeSort(arr,Start,Mid);
        mergeSort(arr,Mid+1,End);
        Merge(arr,Start,Mid,End);
        }
    }
    public void print(int[] arr){
        int L = arr.length;
        for(int i = 0; i<L; i++){
            System.out.print(arr[i]+" ");
        }
    }
   
}
public class MergeSort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Solution obj = new Solution();
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        obj.mergeSort(arr,0,n-1);
        obj.print(arr);
    }
}