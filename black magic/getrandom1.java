class getrandom1
{
    static int ret=0;
    static int arr[];
    getrandom1(int size)
    {
        arr=new int[size];
        int d=0;
        int c=0;
        while(c<size)
        {
            int l=0;            
            l=(c%2==0||c>9)?100:10;
            d=(int)(Math.random()*l);
            if(!find(d)&&d<=size)
            {
                arr[c]=d;
                c++;                
            }            
        }
    }
    static int get(int n)
    {
        return arr[n];
    }
    boolean find(int num)
    {
        boolean t=false;
        for(int i=0;i<arr.length;i++)
        if(arr[i]==num)t=true;
        return t;
    }
}
        