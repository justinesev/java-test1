import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Task 4: Branding
//        Now that we have a hip logo, let's work on our business name.
//        Nowadays all cool brand names are palindromes - words or sentences that read the same from both ends.
//        For example: "level", "step on no pets". We should make our company name palindromic as well, and we should do it quick!
//
//        Create an application that:
//        prints if your user input is a palindrome or not

        System.out.print("Write your logo version: ");
        String logo = sc.nextLine();
        String palindrome = "";

        for (int i = (logo.length() - 1); i >= 0; i--) {
            palindrome += logo.charAt(i);
        }


        if (logo.equals(palindrome)) {
            System.out.println("yes");
        } else System.out.println("no");


    }
}




