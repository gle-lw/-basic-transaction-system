import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int setPin = 9876;
        final String setUsername = "Lumbasi";
        int currentNumberOfAttempts = 0;
        final int maxNumberOfAttempts = 3;
        double currentBalance = 1234567.89;



        while (true) {
            System.out.println("Enter your username");
            String username = sc.next();
            System.out.println("Enter your pin");
            int pin = sc.nextInt();
            if (username.equals(setUsername) && pin == setPin) {
                System.out.println("Acess Granted!" + username + ".");

                System.out.println("Which service would you like today?");
                System.out.println("press 1 :DEPOSIT ");
                System.out.println("press 2 :WITHDRAWAL");
                System.out.println("press 3 : EXIT ");

                int service = sc.nextInt();
                switch (service) {
                    case 1:
                        System.out.println("How much would you like to deposit?");
                        double deposit = sc.nextDouble();
                        currentBalance = currentBalance + deposit;
                        System.out.print("Your new balance is" + currentBalance + ".");
                        System.out.print("Thank you for banking with us.");
                        break;
                    case 2:
                        System.out.println("How much would you like to withdraw?");
                        double withdraw = sc.nextDouble();
                        currentBalance = currentBalance - withdraw;
                        System.out.print("Your new balance is" + currentBalance + ".");
                        System.out.print("Thank you for banking with us.");
                        break;
                    case 3:
                        System.out.print("exiting...");
                        System.out.print("Thank you for banking with us.");
                    default:
                        System.out.println("Invalid option");
                        break;
                }


            } else {
                currentNumberOfAttempts +=1;
                if ( currentNumberOfAttempts > maxNumberOfAttempts) g{
                System.out.println("Service Locked. Please contact Customer Care!");
                break;
                }
                System.out.println("Try Again!");
            }

        }

    }
}