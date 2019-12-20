import java.io.*;
import java.util.*;
import java.math.*;
class init
{
  public static void main(String args[])
  {
    int a,b,c,flag;
    b=1;
    flag=0;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter an number\n");
    a=sc.nextInt();
    //System.out.println("Hello world");
    if((a%2)==0)
      {
        System.out.println(a+" is a EVEN number\n");
      }
      else
      {
        System.out.println(a+" is a ODD number\n");
      }
      for(int i=a;i<=100;i++)
      {
      //  int d=a/i;
        if((i%a)==0)
        {
          flag++;
        }
      }
      System.out.print(flag+" numbers are divisible within 100 by"+a+"\n");
    }
  //  System.out.println(a);
}
