
public class Second_Largest {

	public static void main(String[]args)
	{
		int[] a= new int[] {10,40,50,30,52};
		int temp;
		int k=4;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				
				}
			
			}
			if(i==k-1)
			{
				System.out.println(a[i]);
				break;
			}
			
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
			
			
		
		}
	
}
