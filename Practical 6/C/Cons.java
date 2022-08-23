public class Cons {
    int a,b;
    static int count;
    private Cons()      //private default
    {

        count++;
        System.out.println("I'm Default Consstructor "+count);
    }
    private Cons(int a, int b)
    {
        this.a=a;
        this.b=b;
    }
    int getNumFirst()
    {
        return a;
    }
    int getNumSeConsd()
    {
        return b;
    }

    public static void main(String arg[])
    {


        Cons p1=new Cons();
        Cons p2=new Cons();
        Cons p3=new Cons();
        Cons p4=new Cons();
        System.out.println("Instances of Default Consstructor : "+count);

        Cons p5=new Cons(count,5);
        int x=p5.getNumFirst();
        int y=p5.getNumSeConsd();
        int minOutOfTwo=x<y?x:y;
        System.out.println("Minimum of "+x+" and "+y+" is "+minOutOfTwo);
    }
}