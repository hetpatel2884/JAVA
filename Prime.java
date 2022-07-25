import java.util.Scanner;
class Prime
{
      public static void main(String args[])
  {
      Scanner sc = new Scanner(System.in);
      int num= sc.nextInt();
      boolean flag = false;
      for (int i=2; i <= num / 2; ++i)
    {
       if(num%1==0)
     {
     
    flag = true;
    break;
     }
    }    



      if(!flag) 
               System.out.println("a is  Prime");
   
           else
   
               System.out.println("a is not Prime");
   
   }
}