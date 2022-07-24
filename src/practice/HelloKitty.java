package practice;

public class HelloKitty {
    public static void main(String args[]) {
        System.out.println("Hello Kitty! Meow! Meow!");
        // Simple Hello World test
        String name = "Andrew";

        System.out.println(name.toUpperCase());
        System.out.println(name.contains("n"));
        // Simple non-primitive object type test

        int a = 5;
        char b = 'f';
        long c = 144;
        double d = 1.34;

        // Primitive types example.
        addExclamationPoint("Is that a cat?");
    }

    public static void addExclamationPoint(String s) {
        System.out.println(s + "!");
    }
}