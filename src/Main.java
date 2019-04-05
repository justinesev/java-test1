import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Task 2: Admision
//        The potential clients are now piling in, and it is becoming painfully obvious, that the rented room will soon become too small,
//        as it can only house 100 people. It would be impolite from us to turn people away,
//        so let's make a program that does the dirty work for us.
//
//        Create an appliction that:
//
//        reads as input: the amount of people in the room
//        reads as input: the amount of people still in the queue
//        prints if every person in the queue can fit in the room

        int house = 100;

        System.out.print("How many people are in the room: ");
        int room = sc.nextInt();
        System.out.print("How many people are in the queue: ");
        int queue = sc.nextInt();

        if (room + queue > 100) {
            System.out.println("My apologies, but not all of the people standing in queue can fit in the room :(");
        } else System.out.println("Perfect! All the people in the queue can fit in the room :)) ");


    }
}
