class UnitDigit
{
    public static void main(String[] args)
    {
     int num=9999999;
     int sum=0;
     while(num>0)
        {
         sum=sum+num%10;
         num=num/10;
         }  
     System.out.println(sum);
     while(sum>10)
        {
         sum=sum%10+sum/10;
         System.out.println(sum);
        }
   }
}
