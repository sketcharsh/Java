
public class Min_Array {
	
	public static void main(String args[]) 
	{
		int[] a=new int[] {10,14,18,74,10,7,8};
		
		int Min=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<Min)
			{
				
				Min=a[i];
				
		    }
		}
		System.out.println("minimum number is " +Min);
	}

}
