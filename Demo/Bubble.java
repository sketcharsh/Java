class Bubble{
    Bubble()
    {
        int a[] = new int[]{34,23,56,12,66};
        int temp=0;
        for(int i=0;i<a.length;i++)
        {
            int flag=0;
            for(int j=0;j<a.length-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=1;
                }
            }
            if(flag==0)
            {
                break;
            }
            
        }
        for(int l:a)
        System.out.println(l);
    }
    public static void main(String []args) {
        new Bubble();
    }
}