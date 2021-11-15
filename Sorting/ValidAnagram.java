import java.util.Arrays;
import java.util.Scanner;

public class ValidAnagram {
    static char[] BubbleSort(String str){
   
        char[] charr = str.toCharArray();
        for(int i=0; i<charr.length-1; i++) {
            
            boolean flag = false;
            
            for(int j=0; j<charr.length-i-1; j++) {
                if(charr[j]>charr[j+1]) {
                    
                    char temp = charr[j];
                    charr[j]=charr[j+1];
                    charr[j+1]=temp;
                    flag = true;
                }
            }
            if(!flag) break;
        }
        
        return charr;
    }
      static boolean validAnagram(String str1, String str2){
        if(str1.length() == str2.length()){
            char[] charr1 = BubbleSort(str1);
            char[] charr2 = BubbleSort(str2);
            if(Arrays.equals(charr1,charr2)) return true;
            return false;
        }
        return false;
      }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(validAnagram(str1,str2));

    }
}
