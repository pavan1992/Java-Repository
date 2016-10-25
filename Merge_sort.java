class Merge_sort
{

 public static void main(String[] args)
   {
    // int[] a={11,29,34,50,9,10,75,86};
    // int size=a.length;

               int a[] = {12, 11, 13, 5, 6, 7,98,45,357};
               int size=a.length;
             
       Merge_sort ob=new Merge_sort();      
       ob.mergesort(a,0,size-1);
       for(int i=0;i<size;i++)
       System.out.println(a[i]+"\n");
   }


   public void mergesort(int a[],int l,int r)
   {
        if(l<r)
        {
             int mid=(l+r)/2+1;
             mergesort(a,l,mid-1);
             mergesort(a,mid,r);
             merge(a,l,mid,r);
         }
   }
  
   public void merge(int a[],int l,int mid,int right)
   
   {
         int LR1=mid-l;
         int RR2=(right-mid)+1;
         
         int[] L=new int[LR1];
         int[] R=new int[RR2];
                                      
         for(int i=0;i<LR1;i++)  
           L[i]=a[l+i];

         for(int i=0;i<RR2;i++)
           R[i]=a[mid+i];



          int i=0, j=0,k=l;
           
          while(i<LR1 && j<RR2)
          {
            if(L[i] < R[j])
               a[k++]=L[i++];
            else if(L[i] > R[j])
                  a[k++]=R[j++];
            else
               {
                    if(L[i]==R[j])
                     {
                         a[k++]=L[i++];
                             j++;
                     }
                }

           }

           while(i<L.length)
              a[k++]=L[i++];
           while(j<R.length)
              a[k++]=R[j++];

    }                
                             
}

               
                  
                              
       
         

