class Max{
    Max()
    {
        int a[] = new int[]{40,30,60,80,10,90};
        int search = 60;
        int count=-1;
        for(int l:a)
        {
            count++;
            if(l==search)
            {
                System.out.println("GOTCHA");
                System.out.println(count);
            }
        }
    }
    public static void main(String []args) {
        new Max();
    }
}