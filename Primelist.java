import java.util.Scanner;
class Primelist
{
  public static void main(String[]args)
   {
   Scanner sc = new Scanner(System.in);
   
     int i,j,a,count;
       a= sc.nextInt();
            for(i=1;i<=a;i++)
         {
           count=0;
           for(j=1;j<=i;j++)
            {
              if(i%j==0)
               count++;
            }
               if (count==2)
               System.out.println(i+" is Prime Number");
         }
    }
}