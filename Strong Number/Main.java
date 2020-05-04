import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here 
      Scanner a=new Scanner(System.in);
        int n=a.nextInt();
      int temp=n;
      int num=n,rem,sum=0,i,fact;
      while(temp>0)
      {
        fact=1;
        i=1;
        rem=temp%10;
        while(i <= rem)
        {
          fact=fact*i;
          i++;
        }
        sum=sum+fact;
        temp=temp/10;
      }
      if(num==sum)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
    }
}