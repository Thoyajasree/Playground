import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner a=new Scanner(System.in);
    String s=a.nextLine();
    String s1=a.nextLine();
    int n=s.length();
    int n1=s1.length();
    int count=0;
    for(int i=0;i<(n-n1+1);i++)
    {
      boolean is_matching=true;
      for(int j=0;j<n1;j++)
      {
        if(s.charAt(i+j)!=s1.charAt(j))
        {
          is_matching=false;
        }
      }
      if(is_matching==true)
      {
        count++;
      }
    }
    System.out.println(count);
  }
}