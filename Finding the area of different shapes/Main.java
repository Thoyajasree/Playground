import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner a=new Scanner(System.in);
      int ch=a.nextInt();
      switch(ch)
      {
        case 1:
                int s=a.nextInt();
               int sres=s*s;
          System.out.println(sres);
          break;
        case 2:
          int l=a.nextInt();
          int b=a.nextInt();
          int rres=l*b;
          System.out.println(rres);
          break;
        case 3:
           int ba=a.nextInt();
           int h=a.nextInt();
           double tres=(0.5)*(ba*h);
          System.out.println(tres);
          break;
        case 4:
          int r=a.nextInt();
          double cres=3.14*r*r;
          System.out.println(cres);
          break;
    }
    }
}
