class Prime1
{
    public static void main(String[] args)
    {
     int count=0;
     int i=2;
     int n=6;
     while(n>=i)
        {
         if(n%i==0)
         {
          count++;
          }
         if(count>1)
         {
          System.out.println("Not a Prime number");
          break;
         }  
       i++;
        }
        if(count<=1)
           {
            System.out.println("Prime Number");
            }
    }
}
