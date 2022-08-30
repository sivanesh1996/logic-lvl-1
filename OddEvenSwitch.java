class OddEvenSwitch
{
   public static void main(String args[])
    {
      OddEvenSwitch obj=new OddEvenSwitch();
      obj.method(8);
      int a=obj.method2(7);
       System.out.println("The entered number:"+a);

    }
    
    public void method(int n)
    {
     
     int a=n%2; 
    switch(a)
    {
    case 1:
            System.out.println("Odd");
            break;
    case 0:
            System.out.println("even");
            break;
            
    }
    }



    public int method2(int n)
    {
     
     int a=n%2; 
    switch(a)
    {
    case 1:
            System.out.println("--------------------");
            System.out.println("Odd");
            break; 
            
            
            
    case 0:
            System.out.println("--------------------");
            System.out.println("even");
            break;
           
          
            
            
    }
    return n;
    }
}



    

