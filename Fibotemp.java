class Fibotemp
{
    public static void main(String[] args)
   {
    int sum=0;
    int first=0;
    int second=1;

    for(int i=1;i<=7;i++)
    {
     System.out.print(first +" ");
     sum=first+second;
     first=second;
     second=sum;    
    }
   }
}
