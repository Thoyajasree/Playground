import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      int flag1=0;
      int flag2=0;
       Scanner a=new Scanner(System.in);
      int count=a.nextInt();
  int arr[]=new int[count];
for(int i=0;i<count;i++)
  {
    arr[i]=a.nextInt();
  }
      int key=a.nextInt();
      int key1=a.nextInt();
  for(int i=0;i<count;i++)
  {
    if(key==arr[i])
    {
      System.out.println(i);
      flag1=1;
    }
    if(key1==arr[i])
    {
      System.out.println(i);
      flag2=1;
    }
    
  }
      if(flag1==0 || flag2==0)
      {
        System.out.println("-1");
      }
  
    }
}