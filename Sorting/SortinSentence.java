public class SortinSentence{
   
    public static String Sorting(String s) {
        String str[]=s.split(" ");
        String res[]=new String[str.length+1];
        String ret="";
       
        for(int i=0;i<str.length;i++){
            int inx=Character.getNumericValue(str[i].charAt(str[i].length()-1));
            res[inx]=str[i].substring(0,str[i].length()-1);
        }
       
        for(int j=1;j<res.length;j++)
            ret+=(j==res.length-1)?res[j]:res[j]+" ";
       
            return ret;
    }    
    public static void main(String[] args){
        String str = "Myself2 Me1 I4 and3";
        System.out.println(Sorting(str));
    }
}