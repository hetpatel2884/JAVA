class my_number {
    public int number;

    public my_number() {
        number = 0;
    }
}

class number {
    public static void main(String[] arguments) {

        my_number object = new my_number();

        System.out.println("number = " + object.number);

        update(object);
        System.out.println("number = " + object.number);
    }

    public static void update(my_number obj) {
        obj.number++;
    }
}