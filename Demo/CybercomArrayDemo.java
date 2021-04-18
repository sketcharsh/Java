import java.util.Scanner;

public class CybercomArrayDemo {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arrfact60[]=new int[60];
		int cnt=0;
		int lenfact60=1;
		for(int i=1;i<=60;i++)
		{
			if(60%i==0)
			{
				arrfact60[cnt++]=i;
			}
		}
		for(cnt=0;arrfact60[cnt]!=0;cnt++,lenfact60++)
		{

		}
		lenfact60--;
		System.out.println("ArrayFact60 Length : "+lenfact60);
		System.out.println("ArrayFact60 Array  : "+lenfact60);
		for(int i=0;i<lenfact60;i++)
		{
			System.out.print(" "+arrfact60[i]);
		}
		int arrfact40[]=new int[40];
		cnt=0;
		int lenfact40=1;
		for(int i=1;i<=40;i++)
		{
			if(40%i==0)
			{
				arrfact40[cnt++]=i;
			}
		}
		for(cnt=0;arrfact40[cnt]!=0;cnt++,lenfact40++)
		{

		}
		lenfact40--;
		System.out.println();
		System.out.println();
		System.out.println("ArrayFact40 Length : "+lenfact40);
		System.out.println("ArrayFact40 Array  : "+lenfact40);
		for(int i=0;i<lenfact40;i++)
		{
			System.out.print(" "+arrfact40[i]);
		}
		
		int ans[]=new int[40];
		cnt=0;
		int lenans=1;
		for(int i=0;i<lenfact60;i++)
		{
			for(int j=0;j<lenfact40;j++) {
				if(arrfact60.contains(arrfact40[j])==true)
				{
					
				}
			}
		}
		
	}
}
	
