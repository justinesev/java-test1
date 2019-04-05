import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Task 2 (extra):
//        Instead of just printing if everyone can make it, print for every person in the queue, if they can make it in

        int house = 100;

        System.out.print("How many people are in the room: ");
        int room = sc.nextInt();
        System.out.print("How many people are in the queue: ");
        int queue = sc.nextInt();

        for (int i = 1; i <= queue; i++) {

            if (room + i > 100) {
                System.out.println("can't fit");
            } else System.out.println("fit");

        }


    }
}
