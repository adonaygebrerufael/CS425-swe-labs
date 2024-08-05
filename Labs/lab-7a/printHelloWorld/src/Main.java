import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {10, 14, 35, 70, 25, 49};
        printHelloWorld(numbers);
    }

    public static void printHelloWorld(int[] array){
        Arrays.stream(array).forEach(number -> {
            if(number % 5 == 0 && number % 7 == 0) {
                System.out.println("HelloWorld");
            }
            else if (number % 5 == 0) {
                System.out.println("Hello");
            }
            else if(number % 7 == 0) {
                System.out.println("World");
            }
        });
    }
}