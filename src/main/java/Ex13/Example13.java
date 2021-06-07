package Ex13;
import java.util.Scanner;

public class Example13 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        BankAccount Account_1 = new BankAccount();

        System.out.print("What is the principal? ");
        Account_1.setPrincipal(input.nextDouble());

        System.out.print("What is the rate? ");
        Account_1.setRate(input.nextDouble());

        System.out.print("What is number of years? ");
        Account_1.setYears(input.nextInt());

        System.out.print("What is the amount of times interest is compounded? ");
        Account_1.perYear(input.nextInt());
        Account_1.Amount();
    }
}
