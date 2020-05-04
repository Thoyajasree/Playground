import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner a=new Scanner(System.in);
    int max=0,min,temp;
    int n=a.nextInt();
    int b[]=new int[n];
    for(int i=0;i<n;i++)
    {
      b[i]=a.nextInt();
    }
    for(int i=0;i<n;i++)
    {
      min=i;
      if(b[min]>b[max])
      {
        temp=min;min=max;
        max=temp;
      }
    }
    System.out.println(max);
    }
     }
