
public class Insert {
	
	public static void main(String args[])
	{
		int[] a=new int[] {10,20,50,40,70};
		int pos=2;
		int element=30;
		
		for(int i=a.length-1;i>pos;i--)
		{
			a[i]=a[i-1];
			
		}
		a[pos]=element;
		
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
	}

}
