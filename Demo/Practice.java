
public class Practice {
	
	
	public static void main(String args[])
	{
		
		int temp=0;
		for(int i=1;i<=100;i++)
		{
			for(int j=2;j<i-1;j++)
			{
				if(i%j==0)
				{
					temp++;
				}
			}
			if(temp==0)
			{
				System.out.print(i+" ,");
			}
			else
			{
				temp=0;
			}
		
		}
		
		
		
	}

}
