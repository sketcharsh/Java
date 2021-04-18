

/*
 * 
 * Member Method
 * same name as class name
 * It will never return anything
 * It will be used to allocate memory
 * If you dont create constructer in the class it will be there in your class
 * 
 */
 class Constructor {
	
	
	int i,j,k;
	
	public Constructor() 	
	{
		i=5;
		j=6;
		k=7;
		
		System.out.println("j is "+j);
		
	}
	
	public Constructor(int num1,int num2) 
	{
		i=num1;
		j=num2;
		
		System.out.println("now j is"+j);
	}
	

}

	 class Test
{
	public static void main(String args[]) 
	{
		Constructor obj=new Constructor(7,8);
		
	}
}