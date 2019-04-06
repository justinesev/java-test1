import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

////    TASK 4

//        System.out.print("Write your logo version: ");
//        String logo = sc.nextLine();
//        String palindrome = "";
//
//        for (int i = (logo.length() - 1); i >= 0; i--) {
//            palindrome += logo.charAt(i);
//        }
//
//        palindrome.toLowerCase();
//
//        if (logo.equals(palindrome)) {
//            System.out.println("yes");
//        } else System.out.println("no");
//
//
//    }

// TASK 5
//        System.out.print("Please enter your credit card number: ");
//        String number = sc.next();
//
//        int hash = 0;
//
//        for (int i = 0; i < (number.length() - 1); i++) {
//            if (number.charAt(i) == number.charAt(i + 1) && Character.isDigit(number.charAt(i))  ) {
//                hash += (number.charAt(i) - 48);
//
//                System.out.println(hash);
//            }


////        TASK 5 (extra):
////        To increase security ignore any letters and dashes, and also consider the card number to "loop" around itself
////        (a.k.a.imagine that the first digit follows the last one).
//        System.out.print("Please enter your credit card number: ");
//        String number = sc.next();
//
//        String security = number.replaceAll("[^\\d.]", "");
//
//        security += security.charAt(0);
//
//        int hash = 0;
//
//        System.out.println(security);
//
//
//        for (int i = 0; i < (security.length() - 1); i++) {
//            if (security.charAt(i) == security.charAt(i + 1)) {
//                hash += (security.charAt(i) - 48);
//            }
//        }
//        System.out.println(hash);

//        Task 6: A glitch
//        Oh, no! The mobile app is so successfull that hackers are now targeting it!
//        They are using a vulnerability that exploits unmatched parenthesis! We must add an extra layer of security!
//
//                Create an application that:
//
//        lets the user input a string of parenthesis
//        outputs if it is properly matched or not
        System.out.println("Enter the parenthesis: ");
        String parent = sc.next();
        int count = 0;

        for (int i = 0; i< parent.length(); i++) {
            if (parent.charAt(i)==40) {
                count ++;
            } else count --;
        }

        System.out.println(count == 0 ? "valid" : "invalid");

    }
}



