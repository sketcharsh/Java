
public class Max_Array {

	public static void main(String args[])
	{
		int a[]= {10,14,18,74,10,7,8};
		
		int Max=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>Max)
			{
				Max=a[i];
			}
		}
		
		System.out.println("Max value is " +Max);
	}
	
	
}
