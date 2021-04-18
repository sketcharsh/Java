
public class Binary {

	public static void main(String args[])
	{
		int[] a=new int[] {10,20,30,40,50,60,70,70};
		int li=0;	//10
		int hi=a.length-1;	//70
		int mi= (li+hi)/2;	//40
		int item=50;
		while(li<=hi)
		{
			if(a[mi]==item)
			{
				System.out.println("index of element is on"  +mi+   "index position");
				break;
			}
			else if(a[mi]<item)
			{
				li=mi+1;
			}
			else if(a[mi]>item)
			{
				hi=mi-1;
			}
			mi=(li+hi)/2;
			
		
		}
	}
		
	}
	

