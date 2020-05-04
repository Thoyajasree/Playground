import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner a=new Scanner(System.in);
      int n=a.nextInt();
      int x=add(n);
      System.out.println(x);
    }
  public static int add(int num)
  {
    int sum=0;
    for(int i=1;i<=num;i++)
    {
      sum+=i;
	}
    return sum;
}
}