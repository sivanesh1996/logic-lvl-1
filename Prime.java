class Prime
{
    public static void main(String[] args)
    {
    int n=7;
    System.out.println("Factors are:");
    int count=0;
    int i=1;
    while(n>=i)
      {
        if(n%i==0)
        {
        System.out.println(i);
        count++;
        }
        i++;
      }

    System.out.println("number of factors:\n"+count);
    if(count==2)
        {
        System.out.println(n +" is a prime number");
        }
    else
        {
        System.out.println(n+" is not a prime number");
        }
    }
}
    
