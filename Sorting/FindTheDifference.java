import java.util.Scanner;

public class FindTheDifference {
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
  static char findDifferrence(String str1, String str2){
     char[] charr1 = BubbleSort(str1);
     char[] charr2 = BubbleSort(str2);
      for(int i=0; i<str1.length(); i++){
          if(charr1[i] != charr2[i]){
              return charr2[i];
          }
      }
      return charr2[charr2.length-1];
  }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(findDifferrence(str1, str2));
        
    }
}
