class Swap
{
    public static void main(String args[])
    {
     Swap obj=new Swap();
     obj.swap2temp(39,43);
     obj.swap3temp(5,9,14);
     obj.swap2notemp(21,17);
     obj.swap3notemp(12,19,14);
     
    }
    public void swap2temp(int a,int b)
    {
     System.out.println("Two values :Before swap :");
     System.out.println("("+a+ ","+b+")");
    //System.out.println("Two values:Before swapping:             " ("("+a+ ","+b+")"));
     int temp=a;
            a=b;
            b=temp;
     //System.out.println("("+a+ ","+b+")");
    //System.out.println("Two values:After swapping without temp:  " +a  , +b);
     System.out.println("Two values :After swap with temp variable:");
     System.out.println("("+a+","+b+")");
    }
    public void swap3temp(int a,int b,int c)
    {
     System.out.println("Three values :Before swap:");
     System.out.println("("+a+ ","+b+","+c+")");
     
     int temp=a;
           a=b;
           b=c;
           c=temp;
     System.out.println("Three values :After swap with temp variable:");
     System.out.println("("+a+","+b+","+c+")");
     
    }
    public void swap2notemp(int a,int b)
    {
     System.out.println("Two values :Before swap:");
     System.out.println("("+a+ ","+b+")");
     a=a+b;
     b=a-b; 
     a=a-b;
     System.out.println("Two values :After swap without temp variable:");
     System.out.println("("+a+","+b+")");
     
    }
    public void swap3notemp(int a,int b,int c)
    {
     System.out.println("Three values :Before swap:");
     System.out.println("("+a+ ","+b+","+c+")");
     a=a+b+c;
     b=a-(b+c);
     c=a-(b+c);
     a=a-(b+c);
     System.out.println("Three values :After swap without temp variable:");
     System.out.println("("+a+","+b+","+c+")");
    }
}
