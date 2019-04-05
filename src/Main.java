import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Task 5: Mobile market
//        With the brand all set up, you decided to make a run in the smartphone app market.
//        You outsourced the development of your mobile app, but of course the company tasked with it was incompetent.
//        Credit card encryption is seriously flawed and it is up to you to fix it.
//        You decide to pick the current top-notch encryption algorithm which goes like this:
//
//        Looking at the credit card number digit-by-digit create a single "hash" by summing together all digits that are
//        followed by the same digit.
//
//        Create an application that:
//
//        lets the user input their credit card number
//        outputs the hash
        
        System.out.print("Please enter your credit card number: ");
        String number = sc.next();

        int hash = 0;

        for (int i = 0; i < (number.length()-1); i++) {
             if (number.charAt(i) == number.charAt(i + 1)) {
                hash += (number.charAt(i) - 48);
            }
        }
        System.out.println(hash);
    }
}




