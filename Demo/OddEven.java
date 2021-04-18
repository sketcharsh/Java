class OddEven {
    public static void main(String []args)
    {
        int number = 8;
        for(int i=1;i<=10;i+=2)
        {
            if(i == number)
            {
                System.out.println("Number is odd");
                break;
            }
            else
            {
                continue;
            }
        }
        for(int i=2;i<=10;i+=2)
        {
            if(i == number)
            {
                System.out.println("Number is Even");
                break;
            }
            else
            {
                continue;
            }
        }
    }
}