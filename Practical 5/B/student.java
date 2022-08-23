import java.util.Scanner;
class stu
{
    int enroll,sub1,sub2,sub3;
    String name;
    public void insert()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Enrollement number: ");
        enroll=sc.nextInt();
        System.out.println("Enter the Name: ");
        name=sc.next();
        System.out.println("Enter the marks of Subject 1:  ");
        sub1=sc.nextInt();
        System.out.println("Enter the marks of Subject 2:  ");
        sub2=sc.nextInt();
        System.out.println("Enter the marks of Subject 3: ");
        sub3=sc.nextInt();
    }
    public void disp()
    {
        int sum;
        System.out.println("Enrollement number: "+enroll);
        System.out.println("Name: "+name);
        System.out.println("Marks of Subject 1:" +sub1);
        System.out.println("Marks of Subject 2:" +sub2);
        System.out.println("Marks of Subject 3:" +sub3);
        sum=sub1+sub2+sub3;
        System.out.println("Total Marks of student: "+sum);
    }
}
class student
{
    public static void main(String[] args) {
        stu a = new stu();
        a.insert();
        a.disp();
    }
}