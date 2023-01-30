
import java.util.Scanner;

public class SimpleBot {

    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        greeting();
        guessAge();
        counting();
        test();
        end();

    }
    static void greeting(){
        //Chatbot conversation introduction
        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2018.");
        System.out.println("Please, remind me your name.");
        String yourName = scanner.next(); // input your name
        // string formatting using %s
        System.out.printf("What a great name you have, %s! \n", yourName);

    }

    static void guessAge(){
        // guess age game
        System.out.println("Let me guess your age.");
        System.out.println("Enter reminder of dividing your age by 3, 5, 7");

        int reminder3 = scanner.nextInt(); // enter your age/3 reminder
        int reminder5 = scanner.nextInt(); // enter your age/5 reminder
        int reminder7 = scanner.nextInt(); // enter your age/7 reminder

        // Calculating the age from the reminder
        int age = ((reminder3 * 70) + (reminder5 * 21) + (reminder7 * 15)) % 105;

        //string formatting using %d
        System.out.printf("Your age is %d, that's a good time to start programming! \n", age);

    }

    static void counting(){
        // counting number ability
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int number = scanner.nextInt();// input number

        for (int i = 0; i <= number; i++) {
            System.out.printf("%d!\n", i); // print loop 0 <= input number
        }

    }

    static void test(){
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we used method?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");

        int answer = 0;

        while (answer != 2) {
            answer = scanner.nextInt();
            if (answer == 2) {
                break;
            } else {
                System.out.println("Please, try again.");

            }
        }

    }

    static void end(){
        System.out.println("Congratulations, have a nice day!\n");
    }
}