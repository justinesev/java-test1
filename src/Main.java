import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        ask 5 (extra):
//        To increase security ignore any letters and dashes, and also consider the card number to "loop" around itself
//        (a.k.a.imagine that the first digit follows the last one).
//


        System.out.print("Please enter your credit card number: ");
        String number = sc.next();

        String security = number.replaceAll("[^0-9\\+]", "");

        security += security.charAt(0);

        int hash = 0;

        for (int i = 0; i < (security.length() - 1); i++) {
            if (security.charAt(i) == security.charAt(i + 1)) {
                hash += (security.charAt(i) - 48);
            }
        }
        System.out.println(hash);
    }
}




