public class PrintWaveMatrix {
    public static void main(String[] args){
        int[][] a = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println();
		int row=a.length;
		int col=a[0].length;
		for(int i=0;i<col;i++)
		{
			if(i%2==0)
			{
				for(int j=0;j<row;j++)
				{
					System.out.print(a[j][i]+" ");
				}
			}
			else
			{
				for(int j=row-1;j>=0;j--)
				{
					System.out.print(a[j][i]+" ");
				}
			}
		}
	}
    
}
