import java.util.*;
import java.util.HashSet;
public class Duplicate {
	
	public static void main(String args[])
	{
		int[] a= new int[] {1,2,3,4,1,2,5,6};
		
		Set<Integer> s=new HashSet<>();
		
	for(int no:a)
	{
		if(s.add(no)==false)
		{
			System.out.println(no+"");
		}
	}
				
		
	}

}
