import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here  
      Scanner a=new Scanner(System.in);
      String s=a.nextLine();
       String s2=a.nextLine();
      String s3=a.nextLine(); 
      int n=s.length();
      String ss;
      ss=s.replace(s2,s3);
      System.out.println(ss);
}
}