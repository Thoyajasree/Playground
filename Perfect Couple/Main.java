import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner a=new Scanner(System.in);
      int n=a.nextInt();
      int b[]=new int[n];
      for(int i=0;i<n;i++)
      {
        b[i]=a.nextInt();
      }
      int sum=a.nextInt();
      fun(n,b,sum);
    }
  public static void fun(int n,int arr[],int sum)
  {
    for(int i=0;i<n-1;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        if(arr[i]+arr[j]==sum)
        {
          System.out.print( arr[i]+","+" "+arr[j]);
          System.out.println();
        }
    }
    }
  }
}