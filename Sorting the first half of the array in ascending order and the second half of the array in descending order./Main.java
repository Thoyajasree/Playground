import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
     Scanner a=new Scanner(System.in);
    int n=a.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
    arr[i]=a.nextInt();
    }
    for(int i=0;i<n/2;i++)
    {
      for(int j=i+1;j<n/2;j++)
      {
      if(arr[i]>arr[j])
      {
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
      }
      }
    }
    for(int i=n/2;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
      {
      if(arr[i]<arr[j])
      {
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
      }
      }
    }
    for(int i=0;i<n;i++)
    {
      System.out.print(arr[i]+" ");
    }
  }
}