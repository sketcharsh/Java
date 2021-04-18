import java.util.*;
public class Sarkari{
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int cntCharLine=1;
		char ch;
		for(int i=1;i<=5;i++)
		{
			if(i%2==0)
			{
				cntCharLine++;
			}
			for(int sp=5;sp>=i;sp--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				//ch=65+(i-1);
				if(i%2==0)
				{
					System.out.print(" "+i);
				}
				else
				{
					System.out.print(" "+(char)(64+cntCharLine));
				}
			}
			System.out.println();
		}
		ch='A';
		int val=ch;
		System.out.println("value of "+ch+" : "+val);
	}
	
	
	
}
