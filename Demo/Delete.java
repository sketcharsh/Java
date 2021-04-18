
public class Delete {
	
	public static void main(String args[])
	{
		int[] a=new int[] {10,20,30,40,50};
		int d=30;
		for(int i=0;i<a.length;i++)
		{
			if(d==a[i])
			{
				for(int j=i;j<a.length;j++)
				{
					a[j]=a[j+1];
				}
				break;
			}
		}
		
		for(int i=0;i<a.length-1;i++)
		{
			System.out.println(a[i]);
		}
	}

}
