import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
      Scanner a=new Scanner(System.in);
      int n=a.nextInt();
      int num=1;
      for(int row=1;row<=n;row++)
      {
        for(int space=1;space<=(n-row);space++)
        {
          System.out.print(" ");
        }
        for(int col=1;col<=row;col++)
        {
          System.out.print(num++);
          System.out.print(" ");
        }
        System.out.print("\n");
      }
    }    
}