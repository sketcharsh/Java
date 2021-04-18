import java.util.Set;
import java.util.HashSet;
public class Duplicate_ {
	
	public static void main(String args[])
	{
		int[] a=new int[] {1,2,2,3,4,5,4};
		
		Set<Integer> s=new HashSet<>();// HashSet is class ,and Set is interface ,we don't create interface object thats y we create object of HashSet
	
		for(int no:a)
		{
			if(s.add(no)==false)
			{
				System.out.print(no);
			}
	
		}
		System.out.println();
	
	}

}
