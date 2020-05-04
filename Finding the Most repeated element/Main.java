import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner a=new Scanner(System.in);
    int n=a.nextInt();
    int arr[]=new int[n];
    int freq[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=a.nextInt();
    }
    System.out.println(seq(arr,n,freq));
  }
  public static int seq(int arr[],int n,int freq[])
  {
    int max=0,cur=1;
    for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
      {
      if(arr[i]==arr[j])
      {
        cur++;
      }
    }
      freq[i]=cur;
      cur=1;
    }
    for(int i=0;i<n;i++)
    {
    if(freq[i]>freq[max])
    {
      max=i;
    }
    }
    return arr[max];
  }
}