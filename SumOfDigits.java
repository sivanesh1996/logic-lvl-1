class SumOfDigits
{
    public static void main(String args[])
    {
     int n=55555;
     if(n>=0 && n<=9999)
      {
        if(n>=0 && n<=99)
        {
            if(n<=9)
            {
            System.out.println(n);
            }
            else
            {
            int s=(n%10)+(n/10);
             System.out.println(s);
            }
        }
        else
        //{
        //if(n>=100 && n<=9999)
        {
            if(n<=999)
            {
             int s=n%10;
             int t=n/10;
             int u=(t%10)+(t/10);
             System.out.println(s+u);
            }
            else
            {
             int s=n%10;
             int t=n/10;
             int u=t%10;
             int v=t/10;
             int w=v%10;
             int x=v/10;
             System.out.println(s+u+w+x);
            }
        }
        }
        
    else
    {
      System.out.println("Enter a number between 0 and 9999");
    }
      
    }
}

        
    
        
