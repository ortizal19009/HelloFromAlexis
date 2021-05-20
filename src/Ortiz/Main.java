package Ortiz;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String name = "Alexis";
        String message = "Hello, my name is %s";
        System.out.println(message.format(message, name));
    }
}
