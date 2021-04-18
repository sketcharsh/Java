
public class Linear {
	
	public static void main(String args[])
	{
		int[] a=new int[] {10,20,30,40,50};
		int item= 90;
		int cont=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==item)
			{
				System.out.println("index of element is"+i);
			
				cont++;
			}
			
		
		}
		 if(cont==0)
		{
			System.out.println(" element is not in list");
		}
	}

}
