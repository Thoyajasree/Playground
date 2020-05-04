import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner a=new Scanner(System.in);
      int n=a.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=a.nextInt();
      }
      int miss=0;
      for(int i=1;i<=n;i++)
      {
        boolean found=false;
        for(int j=0;j<=n-1;j++)
        {
          if(arr[j]==i)
          {
            found=true;
            break;
          }
        }
        if(found==false)
        {
          miss=i;
          break;
        }
      }
      System.out.println(miss);
    }
}