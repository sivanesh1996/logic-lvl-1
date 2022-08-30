class Prime3
{
    public static void main(String[] args)
    {
     int count=0;
     int i=2;
     int n=17;
     while(n>i)
    {
     if(n%i==0)
        {
         count++;
        }
     if(count>0)
        {
         System.out.println("Not a prime number");
         break;
        }  
        i++; 
    }
    if(count<=0)
        {
         System.out.println("Prime number");
        }
    }
}
    
