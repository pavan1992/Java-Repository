class Arrayoperation
{
   public static void main(String args[])
   {

     int a[]={20,-30,40,50,-60,-10};
     int k=4;
     int sum=0;
     
     System.out.println("The given array is \n");
     for(int i=0;i<a.length;i++)
       System.out.println(a[i]+"\n");

     sum_max(a,k);

     for(int i=0;i<a.length;i++)
          sum=sum+a[i];

     System.out.println("total sum of the array after "+k+" operations is " + sum);
    
      
   }


  public static void sum_max(int[] a,int k)
  {
       while(k>0)
       {

        int  min=a[0];
        int index=0;
        
        for(int i=0;i<a.length;i++)
        {
            if(min>a[i])
              {
                 min=a[i];
                 index=i;
              }
          
        }

       a[index]=-a[index];
       k--;
      }

  }


}
