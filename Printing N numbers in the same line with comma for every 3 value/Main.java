import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   int n,i;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    for(i=1;i<=n;i++)
    {
      System.out.print(i);
      if(i%3==0)
        System.out.print(",");//Type your code here
  }
}
}