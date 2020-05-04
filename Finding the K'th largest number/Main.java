import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      // Type your code here
      Scanner a=new Scanner(System.in);
      int n=a.nextInt();
      int arr[]=new int[n];
      int k=a.nextInt();
      for(int i=0;i<n;i++)
      {
        arr[i]=a.nextInt();
      }
      for(int i=0;i<n;i++)
      {
        for(int j=i+1;j<n;j++)
        {
          if(arr[j]>arr[i])
          {
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
          }
        }
      }
      /*for(int i=0;i<n;i++)
      {
        System.out.println(arr[i]);
      }*/
      System.out.println(arr[3]);
      
    }   
}