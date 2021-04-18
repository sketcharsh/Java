import java.util.HashSet;
public class Duplicat_twoArray {
	
	public static void main(String args[])
	{
		int[] a=new int[] {1,2,4,5,7,8,9,1,8};
		int[] b=new int[] {2,6,8,11,12,45,5,41};
		HashSet<Integer>hs=new HashSet<>();
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
						{
							hs.add(a[i]);
							break;
						}
			}
		}
		for(int k:hs)
		{
			System.out.println(k);
		}
	}

}
