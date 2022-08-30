class Prime5
{
 public static void main(String[] args)
    {
     int count=0;
     int i=2;
     int n=61;
     boolean flag=false;
     while(n/2>i)
     {
      if(n%i==0)
        {
         count++;
        }
     /* if(count>0)
        {
        count++;
        } */
      if(count>0)
        {
         flag=true;
         break;
        }
        i++;
     }
      if(flag==true)
        {
         System.out.println("Not a prime");
        }
        else
        {
        System.out.println("Prime number");
        }
    }
}
