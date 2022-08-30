class Prime4
{
    public static void main(String[] args)  
    {
     int count=0;
     int i=2;
     //int input=6;
     //int n=input/2;
     int n=2;
     while(n/2>i)
        {
         if(n%i==0)
            {
             count++;
            }
         if(count>0)
            {
             System.out.println("Not a prime");
             break;
            }
             i++;
         }
         if(count<=0)
           {
            System.out.println("Prime Number");
            } 
    }
}
