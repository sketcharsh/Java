class Prime{
    Prime()
    {
        int count=0;
        String primeNumbers = "";
       for(int i=1;i<=100;i++)
       {
        for(int no=i;i>=1;i--)
        {
            if(i%no==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            primeNumbers = primeNumbers + i + " ";
        }
        System.out.println(primeNumbers);
       } 
    }
    public static void main(String []args) {
        new Prime();
    }
}