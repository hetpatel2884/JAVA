import java.util.Scanner;
class area
{
    public void triangle(float a,float b)
    {
        float r;
        r=0.5f*a*b;
        System.out.println("Area of Triangle is "+r);
    }
    public void circle(float t)
    {
        float a;
        final float pi=3.14f;
        a=pi*t*t;
        System.out.println("Area of Circle is "+a);
    }
    public static void main(String[] args) {
        float b,h,r;
        Scanner sc = new Scanner(System.in);
        area a = new area();
        System.out.println("Enter the base of Triangle: ");
        b = sc.nextFloat();
        System.out.println("Enter the height of Triangle: ");
        h=sc.nextFloat();
        a.triangle(b, h);
        System.out.println("Enter the radius of circle");
        r = sc.nextFloat();
        a.circle(r);
    }
}