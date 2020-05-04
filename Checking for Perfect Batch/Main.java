import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner a=new Scanner(System.in);
    int n=a.nextInt();
    int sum=0,sum1=0,sum2=0;
    int b[]=new int[n];
    for(int i=0;i<n;i++)
    {
      b[i]=a.nextInt();
    }
    for(int i=0;i<3;i++)
    {
      sum+=b[i];
    }
    for(int i=3;i<6;i++)
    {
      sum1+=b[i];
    }
    if(sum==sum1)
    {
      System.out.print("Perfect Batch");
    }
    else
      {
      System.out.print("Not a Perfect Batch");
    } 
  }
}