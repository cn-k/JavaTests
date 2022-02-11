package intro;

public class Test {
    public static void main(String[] args) {
        System.out.println("test");
        Parent parent = new Parent();

        System.out.println(parent instanceof Parent);
    }
}
class Parent{
        String name = "";
}