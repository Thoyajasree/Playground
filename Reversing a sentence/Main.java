import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner a=new Scanner(System.in);
      String s1=a.nextLine();
      StringBuilder sb=new StringBuilder(s1);
      int n=sb.length();
      reverse_string(sb,0,n-1);
      int si=0;
      for(int i=0;i<n;i++)
      {
        if(sb.charAt(i)==' ')
        {
          reverse_string(sb,si,i-1);
          si=i+1;
        }
        else if(i==(n-1))
        {
          reverse_string(sb,si,i);
          si=i+1;
        }
      }
      System.out.println(sb);        
    }
    // Function to reverse a string
    public static void reverse_string(StringBuilder sb, int si, int ei)
    {
        // Type your code here
      int end=ei;
      int front=si;
      while(front<end)
      {
        char temp=sb.charAt(front);
        sb.setCharAt(front,sb.charAt(end));
        sb.setCharAt(end,temp);
        front++;
        end--;
      }
    }
}