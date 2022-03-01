package nested_classes;

public class OuterClass {

    // Input string
    private static String msg = "GeeksForGeeks";

    private void outerNonStaticMethod(){
        System.out.println( "outer non static method called !");
    }
    private static void outerStaticMethod(){
        System.out.println( "outer static method called !");
    }

    // Static nested class
    public static class NestedStaticClass {

        public void printMessage()
        {
            System.out.println(
                    "Message from nested static class: " + msg);
            outerStaticMethod();
        }
    }

    // Non-static nested class -
    // also called Inner class
    public class InnerClass {

        // Both static and non-static members
        // of Outer class are accessible in
        // this Inner class
        public void display()
        {

            // Print statement whenever this method is
            // called
            System.out.println(
                    "Message from non-static nested class: "
                            + msg);
            outerNonStaticMethod();
        }
    }
}
