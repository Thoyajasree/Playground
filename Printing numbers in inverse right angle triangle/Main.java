import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner a=new Scanner(System.in);
      int n=a.nextInt();
      for(int row=n;row>=1;row--)
      {
        int num=row;
        for(int col=1;col<=row;col++)
        {
          System.out.print(num);
          num=num-1;
        }
        System.out.print("\n");
      }
	}
}