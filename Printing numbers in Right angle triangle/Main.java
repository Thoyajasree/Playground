import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int row,col;
      for(row=1;row<=n;row++)
      {
         for(col=1;col<=row;col++)
         {
           System.out.print(row);
         }
        System.out.print("\n");
	 }
}
}
