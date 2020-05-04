import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
        Scanner a=new Scanner(System.in);
      int count=a.nextInt();
      int arr[]=new int[count];
      for(int i=0;i<count;i++)
  		{
    		arr[i]=a.nextInt();
  		}
      int max=0,min,temp;
      for(int i=0;i<count;i++)
      {
        min=arr[i];
       if(min>max)
       {
         temp=min;
         min=max;
         max=temp;
       }
        
      }
      System.out.println(max);
    }
}