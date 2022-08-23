public class pr5_c2 {
    int data = 50;
    void change(pr5_c2 op)
    {
        op.data = op.data+100;
    }
    public static void main(String[] args) {
        pr5_c2 op = new pr5_c2();
        System.out.println("Before change: "+op.data);
        op.change(op);
        System.out.println("After change: "+op.data);
    }
}
