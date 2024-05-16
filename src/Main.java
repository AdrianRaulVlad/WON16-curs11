public class Main {
    public static void main(String[] args) throws Exception {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("My last words...");
            throw e;
        }
        System.out.println("I hope this is printed");
    }

    public static void method1() throws Exception {
        System.out.println("Method 1");
        method2();
    }

    public static void method2() throws Exception {
        System.out.println("Method 2");
        method3();
    }

    public static void method22() throws Exception {
        System.out.println("Method 2.2");
        method3();
        NullPointerException variable = new NullPointerException("I don't like you");
        throw variable;
    }

    public static void method3() throws Exception {
        System.out.println("Method 3");
        throw new Exception("This is a checked exception");
    }
}