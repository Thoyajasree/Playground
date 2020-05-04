import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner a=new Scanner(System.in);
    int n=a.nextInt();
    int arr[]=new int[20];
    int i,j;
    for(i=0;i<n;i++)
    {
      arr[i]=a.nextInt();
    }
    System.out.print(sumseq(arr,n));
  }
  public static int sumseq(int arr[],int n)
  {
    int sum,maxsum,i;
    sum=arr[0];
    maxsum=arr[0];
    for(i=1;i<n;i++)
    {
      if(arr[i]>arr[i-1])
      {
        sum+=arr[i];
      }
      else
      {
        sum=arr[i];
      }
      if(sum>maxsum)
      {
        maxsum=sum;
      }
    }
    return maxsum;
  }
}