import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // type your code here
    Scanner a=new Scanner(System.in);
    int n=a.nextInt();
    //int temp=n;
    //int count=0;
  /*if(n<0)
    {
      n=-n;
    }
    do
    {
      count++;
      n=n/10;
    }while(n>10);
    if(temp<0)
      count=count+1;
      char arr[]=new char[count];
      if(temp<0)
      {
        temp=temp*-1;
        arr[0]='-';
      }
      count=count-1;
      while(temp>0)
      {
        char ch=(char)((temp%10)+'0');
        arr[count+1]=ch;
        temp/=10;
        --count;
      }*/
      System.out.println(n);
  }
}
