import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      Scanner a=new Scanner(System.in);
      int row=a.nextInt();
      int col=a.nextInt();
      int res;
      for(int i=0;i<row;i++)
      {
        for(int j=0;j<col;j++)
        {
          if(j>=i)
          {
            res=row-i;
            for(int k=j;k<col;k++)
            {
              System.out.print(res);
            }
         
          break;
        }
          else
            System.out.print(row-j);
        }
        System.out.println();
      }
    }
}