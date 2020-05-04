import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner a=new Scanner(System.in);
      String s=a.nextLine();
       String s2;
      String s3=a.nextLine(); 
      s2=s+s;
      int n1=s.length();
      int n=s2.length();
      int flag=0;
      for(int i=0;(i+n1)<n;i++)
      {
        if(s3.equals(s2.substring(i,i+(n1))))
        {
         flag=1;
        }
      }
      if(flag==1)
      {
                  System.out.println("Yes");
      }
      else
      {
                  System.out.println("No");
      }
    }
}