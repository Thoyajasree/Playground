import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner a=new Scanner(System.in);
      String s=a.nextLine();
      StringBuilder r=new StringBuilder(s);
      int n=r.length();
      int ar[]=new int[26];
      for(int i=0;i<26;i++)
      {
        ar[i]=0;
      }
      for(int i=0;i<n;i++)
      {
        char ch=r.charAt(i);
        if(ch>='a' && ch<='z')
        {
          ar[ch-'a']++;
        }
 else if(ch>='A' && ch<='Z')
        {
          ar[ch-'A']++;
        }
      }
      for(int i=0;i<26;i++)
      {
        if(ar[i]==0)
        {
          char mc=(char)(i+'a');
          System.out.print(mc+" ");
        }
      }
    }
}