
public class Merge_Array {
	
	public static void main(String args[])
	{
		int[] a=new int[] {10,20,30,40,50};
		int[] b=new int[] {60,70,80,90,100};
		
		int a_long=a.length;
		int b_long=b.length;
		int cl =a_long+b_long;
		
		int[] c=new int[cl];
		int j=0;
		
	for(int i=0;i<c.length;i+=2)
	{
		
		c[i]=a[j];
		j++;
	}
	 int g=0;
	for(int k=1;k<c.length;k+=2)
	{
		c[k]=b[g];
		g++;
	}
		
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
		
			System.out.println();
	}

}
