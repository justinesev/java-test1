import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Task 1: Grand opening!
//        It is the first day of your new business. Time to do a grand opening! Sadly the robot that you hired to do meet-and-greet is broken.
//        The main module is missing and it is up to you to write the core functionality and save the opening ceremony.
//
//        Create an application that:
//
//        greets the user and asks for their name
//        politely echoes the user's name back, and invites them into the opening ceremony
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Hello! What is your name: ");
        String name = sc.nextLine();
        System.out.println("Oh, nice to meet you " + name + "! Please come in to the opening ceremony.");

    }
}
