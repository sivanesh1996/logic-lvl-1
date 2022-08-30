class Prime2
{
    public static void main(String[] args)
    {
     int count=0;
     int i=1;
     int n=6;
     while(n>=i)
        {
         if(n%i==0)
            {
             count++;
            }
        if(count>2)
            {
             System.out.println("Not a prime number");
             break;
            }
          i++;
        }
       if(count<=2)
           {
            System.out.println("Prime Number");
            } 
    }

}
