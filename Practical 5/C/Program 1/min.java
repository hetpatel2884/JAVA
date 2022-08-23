public class min
{
    int a =10;
    void call(min eg)
    {
        eg.a =eg.a+10;
    }
    public static void main(String[] args) {
        min eg = new min();
        System.out.println("Before call-by-reference: " +eg.a);
        eg.call(eg);
        System.out.println("After call-by-reference: " +eg.a);
    }
}