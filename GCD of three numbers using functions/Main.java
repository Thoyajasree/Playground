import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
             Scanner a=new Scanner(System.in);
      int n=a.nextInt();
      int n2=a.nextInt();
      int n3=a.nextInt();
      int x,y;
      x=gcd(n,n2);
      y=gcd(x,n3);
      System.out.println(y);
	}
  public static int gcd(int n1,int n2)
  {
    int min;
    if(n1<n2)
    {
      min=n1;
    }
    else
    {
      min=n2;
    }
    while((n1%min==0)&&(n2%min==0))
    {
      return min;
    }
    min--;
    return 0;
  }
}