public class PrintSpiralAntiClockWise {
    public static void main(String[] args){
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		int m=arr.length;
		int n=arr[0].length;
		int tc=m*n;
		int minr=0;
		int maxr=m-1;
		
		int maxc=n-1;
		int minc=0;
		int count=0;
		
		while(count<tc)
		{
			for(int i=minr;i<=maxr&&count<tc;i++)
			{
				int j=minc;
				System.out.print(arr[i][j]+" ");
				count++;
				
			}
			minc++;
			for(int j=minc;j<=maxc&&count<tc;j++)
			{
				int i=maxr;
				System.out.print(arr[i][j]+" ");
				count++;
			}
			maxr--;
			for(int i=maxr;i>=minr&&count<tc;i--)
			{
				int j=maxc;
				System.out.print(arr[i][j]+" ");
				count++;
			}
			maxc--;
			for(int j=maxc;j>=minc&&count<tc;j--)
			{
				int i=minr;
				System.out.print(arr[i][j]+" ");
				count++;
			}
			minr++;
            
			
		}
    }
}
