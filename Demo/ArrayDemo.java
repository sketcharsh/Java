import java.util.Scanner;

public class ArrayDemo {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]= {10,20,30,40,50};
		int arr[]=new int[5];
		/*-
	    arr[0]=101;
		arr[1]=102;
		arr[2]=103;
		arr[3]=104;
		arr[4]=105;*/
		
		System.out.println("Enter 5 subjects marks : ");
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		int total = 0;
		for(int i=0;i<5;i++) {
			total=total+arr[i];
			System.out.println("Subject "+(i+1)+" : "+arr[i]);
		}
		System.out.println("Subjects Total"+total);
		
	}
}
