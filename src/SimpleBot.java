
import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Chatbot conversation introduction
        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2018.");
        System.out.println("Please, remind me your name.");
        String yourName = scanner.next(); // input your name
        // string formatting using %s
        System.out.printf("What a great name you have, %s! \n", yourName);

        // guess age game
        System.out.println("Let me guess your age.");
        System.out.println("Enter reminder of dividing your age by 3, 5, 7");

        int reminder3 = scanner.nextInt(); // enter your age/3 reminder
        int reminder5 = scanner.nextInt(); // enter your age/5 reminder
        int reminder7 = scanner.nextInt(); // enter your age/7 reminder

        // Calculating the age from the reminder
        int age = ((reminder3 * 70) + (reminder5 * 21) + (reminder7 * 15)) % 105;

        //string formatting using %d
        System.out.printf("Your age is %d, that's a good time to start programming!", age);


    }
}