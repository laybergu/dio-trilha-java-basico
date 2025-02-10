import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class AccountTerminal {
    public static void main(String[] args) throws Exception {
        
        try (Scanner scan = new Scanner(System.in).useLocale(Locale.US)) 
        {
            System.out.print("Please, type the name for the account holder: ");

                String holder = scan.nextLine();
            
            System.out.print("Now, type the branch number for the account: ");

                String branch = scan.nextLine();

            System.out.print("Type the account ID: ");

                int id = scan.nextInt();

            System.out.print("Finally, insert the balance for the new account: ");

                double balance = scan.nextDouble();

            BankAccount account = new BankAccount(
                id,
                branch,
                holder,
                balance
            );

            System.out.println(account.creationMessage());
        } 
    }
}
