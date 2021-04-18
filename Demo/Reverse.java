import java.util.Scanner;
public class Reverse {
	
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		//System.out.println("enter the name");
		String name="level";
		
		int leng=name.length();
		String rev="";
		for(int i=leng-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
		if(rev.equals(name))
		{
			System.out.println("word  is pilondrome");
		}
		else
		{
			System.out.println("word  is not pilondrome");
		}
	}

}
