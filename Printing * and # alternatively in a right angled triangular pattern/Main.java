import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		int row,col,n;
        n=in.nextInt();
      int value=0;
      for(row=1;row<=n;row++)
      {
        for(col=1;col<=row;col++)
        {
          if(value==0)
          {
              System.out.print("*");
               value=1;
          }
            else
             {
               System.out.print("#");
                 value=0;
              }
        }
          System.out.print("\n");
          
      }
}
}