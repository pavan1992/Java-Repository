class Quicksort
{

    public static int  part;

   public static void main(String[] args)
   {
      int[] a={ 2,1,3,32,43,56,665 };

      quicksort1(a,0,2);
      for(int i=0;i<=a.length;i++)
         System.out.println(a[i]+"\n");
   }


   public static void quicksort1(int[] a,int  start,int end)
   {
          if(start<end)
            {
                  part=partition(a,start,end);
                  quicksort1(a,start,part-1);
                  quicksort1(a,part+1,end);
            }
  }


  public static int  partition(int[] a,int start,int end)
 {     

         
         int pivot=a[start];
         int left=start+1;
         int right=end;
         int temp;
 
         while(left<right)
    {
              while(pivot>a[left])
                     left++;
               
              while(pivot>a[right])
                     right--;
               

              if(left<right)
              {
                  temp=a[left];
                 a[left]=a[right];
                 a[right]=temp;
              }
        }


          temp=a[start];
          a[start]=a[right];
          a[right]=temp;

    return right;

}

}



