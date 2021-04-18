
public class Print_Array {
	
	public static void main(String args[])
	{
		int[][] a=new int[][] {{14,18,756,45},{12,10,48,21}};
		int Max=a[0][0];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]>Max)
				{
					Max=a[i][j];
				
				
					
				}
				
			}
			
			
		}
		System.out.println(Max);
	}

}
