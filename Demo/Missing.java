
public class Missing {
	
	public static void main (String args[])
	{
		int[] a=new int[] {1,2,3,7,5,6};
		int expect=a.length+1;
		int total=expect*(expect+1)/2;
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("missing element is"+(total-sum));
		
	}

}
