
import java.util.*;
 class Solution{
     
    public static String Reverse(String str, int length,String revStr){
        if(length < 0)
        return revStr;
        revStr = revStr + str.charAt(length);
        return Reverse(str, length-1, revStr);

        
       
    }
}
public class ReverseString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(), revStr = "";
        int length = str.length();
        System.out.print(Solution.Reverse(str,length-1,revStr));

    }
}