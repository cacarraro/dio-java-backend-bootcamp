
import java.util.Locale;
import java.util.Scanner;

public class TerminalAccount{
    public static void main(String[] args){
        // create a Scan to read the user`s input
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US); // setting locale to accept only float values with . delimiter (avoiding JDK variations)

        // print the message requesting the number data
        System.out.print("Please, type the agency number: ");
        // stores the user`s input for number
        int number = scan.nextInt();

        // print the message requesting the agency data
        System.out.print("Please, type the account number: ");
        // stores the user`s input for agency
        String agency = scan.next();

        // print the message requesting the client name data
        System.out.print("Please, type the first and last client name: ");
        // stores the user`s input for client name
        String clientName = scan.next() + " " + scan.next(); // limitation: if the person types 3+ names it doesn't work

        // print the message requesting the balance data
        System.out.print("Please, type the account balance: ");
        // stores the user`s input for balance
        float balance = scan.nextFloat();
        scan.close();

        System.out.printf("Hello %s, thank you for creating an account with our bank, your agency is %s, " +
                          "account number %s and your current balance of %s is already available for withdraw!",
                          clientName, agency, number, balance);
    }
}
