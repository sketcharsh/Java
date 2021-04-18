
public class PrimeNumber {
	
	public static void main(String args[])
	{
		
	int temp=0;
	int no=30;
	
	for(int i=2;i<no-1;i++)
	{
		if(no%i==0)
		{
			System.out.println("number is Not prime");
			break;
		}
	}
/*	if(temp>0)
	{
		System.out.println("number is Not prime");
	}
	else
	{
		System.out.println("number is prime");
	}*/
	}	

}
