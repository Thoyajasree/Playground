import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner a=new Scanner(System.in);
      int n=a.nextInt();
       int i =0;
       int num =0;
      for (i = 1; i <= n; i++)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
      {	
       System.out.println(i);
   }
      }
}
}