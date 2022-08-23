class TestPrivate {

    // private variables
    private int age;
    private String name;

    // initialize age
    public void setAge(int age) {
        this.age = age;
    }

    // initialize name
    public void setName(String name) {
        this.name = name;
    }

    // access age
    public int getAge() {
        return this.age;
    }

    // access name
    public String getName() {
        return this.name;
    }

}

class MainOne {
    public static void main(String[] args) {
        // create an object of Test
        TestPrivate test = new TestPrivate();

        // set value of private variables
        test.setAge(18);
        test.setName("Het Patel");

        // get value of private variables
        System.out.println("Age: " + test.getAge());
        System.out.println("Name: " + test.getName());
    }
}