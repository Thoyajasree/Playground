import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner a=new Scanner(System.in);
    int base=a.nextInt();
    int exponent=a.nextInt();
    double x=power(base,exponent);
    System.out.println(x);
  }
  public static int power(int base,int exponent)
  {
    int i=1,res=1;
    while(i<=exponent)
    {
      res=res*base;
      i++;
  }
    return res;
}
}