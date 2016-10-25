class Fibonacci
{

  public static int fib(int n)
  {
     if(n==1)
       return 0;
     else if(n==2)
       return 1;
     else
      return fib(n-1)+fib(n-2);
  }

  public static int gcd(int fib1,int fib2)
  {

       int num;


       if(fib1>fib2)
          num=fib2;
       else
          num=fib1;


        while(num>=1)
        {
           if(fib1%num==0 && fib2%num==0)
               return num;
           else
               num--;
        }

      return 1;

  }

       

  public static void main(String args[])
  {
     int i=Integer.parseInt(args[0]);
     int j=Integer.parseInt(args[1]);
    
     int fib1=fib(i);
     int fib2=fib(j);
     int gcd=gcd(fib1,fib2);

     System.out.println("fib of "+i+" is :"+fib1+" fib of "+j+" is:"+fib2);

     System.out.println(" GCD of :"+fib1+" and "+ fib2 +" is "+gcd);
    

  }

}
