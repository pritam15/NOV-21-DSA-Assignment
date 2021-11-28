public class JwelsAndStone {
	
	public int numJewelsInStones(String jewels, String stones) {
        int ans = 0;
        
        for (int i = 0; i < stones.length(); i++) {
            if (jewels.contains(String.valueOf(stones.charAt(i)))) {
                ans += 1;
            }
        }
        return ans;
    }
	 public static void main(String args[]) {
	    	String jewels="Aa";
	        String stones="aAAbb";
	        JwelsAndStone ob=new JwelsAndStone();
	    	System.out.print(ob.numJewelsInStones(jewels,stones));
	    }

}