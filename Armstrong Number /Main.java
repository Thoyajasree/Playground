import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner a=new Scanner(System.in);
        int n=a.nextInt();
      int rem=0,count=0;
      int temp=n,sum=0;
      int num=n;
      while(n!=0)
      {
        rem=n%10;
        n=n/10;
        count++;
	}
     while(temp!=0)
     {
       rem=temp%10;
       sum+=Math.pow(rem,count);
       temp=temp/10;
     }
      if(sum==num)
      {
      System.out.println("Armstrong Number");
      }
      else 
        System.out.println("Not a Armstrong Number");
}
}