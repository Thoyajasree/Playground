import java.util.*;
class Main
{
    public static void main(String args[])
    {
        //Try your logic her
      Scanner a=new Scanner(System.in);
      int base=a.nextInt();
      int exponent=a.nextInt();
      int i=1;
      int result=base;
      while(i<exponent)
      {
        result=result*base;
        i++;
      }
      System.out.println(result);
    }
}