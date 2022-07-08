public class Animal {

    private static int weight = 69;
    private static String color = "blue";
    private static String breed = "dog";
    private static boolean isAlive = true;

    public static void main(String[] args) {

        String[] names = {"Ana", "Andrei", "Alex"};
        //                 0        1         2
        for (int index = 0; index < names.length; index++){
            System.out.println("My name is:" + names[index]);
        }

    }
}
