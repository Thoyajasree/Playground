import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
       Scanner a=new Scanner(System.in);
      int n=a.nextInt();
      int n2=a.nextInt();
      int n3=a.nextInt();
      int x,y;
      x=func(n,n2);
      y=func(x,n3);
      System.out.println(y);
	}
  public static int func(int num1,int num2)
  {
    if(num1>num2)
    {
      return num1;
    }
    else
    {
      return num2;
    }
	}
}