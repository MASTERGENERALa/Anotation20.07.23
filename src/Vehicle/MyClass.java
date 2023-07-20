package Vehicle;

public class MyClass {
    private static String staticField;

    static {
        staticField = "This is a static field initialized in a static block.";
    }

    public static void printStaticField() {
        System.out.println(staticField);
    }
}

