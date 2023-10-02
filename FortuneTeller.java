import java.util.InputMismatchException;
import java.util.Scanner;

public class FortuneTeller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("What is your first name?");
            String firstName = scanner.nextLine();

            System.out.println("What is your last name?");
            String lastName = scanner.nextLine();

            String[] roygbivColors = { "red", "orange", "yellow", "green", "blue", "indigo", "violet" };
            String output = String.join(" ", roygbivColors);
            System.out.println(output);
            for (String string : roygbivColors) {
                System.out.println(string);

            }

            System.out.println("What is your favorite ROYGBIV color? Or help");
            String favoriteColor = scanner.nextLine();

            if (favoriteColor.equalsIgnoreCase("help")) {
                System.out.println("The ROYGBIV colors: " + output);
                System.out.println("Enter your favorite color: ");
                favoriteColor = scanner.nextLine();
            }

            System.out.println("What is your age?");
            int age = InputValidator.validateInput(scanner, 0, Integer.MAX_VALUE);

            System.out.println("What is your birth month? (as a number)");
            int birthMonth = InputValidator.validateInput(scanner, 1, 12);

            System.out.println("Enter the number of sibling you have:");
            int siblingNumber = InputValidator.validateInput(scanner, 0, Integer.MAX_VALUE);

            int retirementYears = (age % 2 == 0) ? 12 : 14;

            String vacationHomeLocation;
            if (siblingNumber == 0) {
                vacationHomeLocation = "Boca Raton, FL";

            } else if (siblingNumber == 1) {
                vacationHomeLocation = "Nassau, Bahamas";
            } else if (siblingNumber == 2) {
                vacationHomeLocation = "Ponta Negra, Brazil";
            } else if (siblingNumber == 3) {
                vacationHomeLocation = "Portland, Oregon";
            } else if (siblingNumber > 3) {
                vacationHomeLocation = "Baton Rouge, LA";
            } else {
                vacationHomeLocation = "Chernobul, Ukraine";
            }

            String transportation = "";
            switch (favoriteColor.toLowerCase()) {
                case "red":
                    transportation = "Maserati";
                    break;

                case "orange":
                    transportation = "stallion";
                    break;

                case "yellow":
                    transportation = "chariot";
                    break;

                case "green":
                    transportation = "taxi";
                    break;

                case "blue":
                    transportation = "rickshaw";
                    break;

                case "indigo":
                    transportation = "motor scooter";
                    break;

                case "violet":
                    transportation = "flying saucer";
                    break;

                default:
                    transportation = null;
                    break;
            }

            String bankBalance;
            if (birthMonth >= 1 && birthMonth <= 4) {
                bankBalance = "$256,000.76";
            } else if (birthMonth >= 5 && birthMonth <= 8) {
                bankBalance = "$3,687,105.42";
            } else if (birthMonth >= 9 && birthMonth <= 12) {
                bankBalance = "$86.23";
            } else {
                bankBalance = "$0";
            }

            System.out.printf(
                    "%s %s will retire in %d years with %s in the bank, a vacation home in %s, and travel by %s.%n",
                    firstName, lastName, retirementYears, bankBalance, vacationHomeLocation, transportation);

            scanner.nextLine();

            System.out.println("\nEnter 'Quit' to exit or any other key to try again: ");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("quit")) {
                System.out.println("Nobody likes a quitter....");
                break;
            }
        }
        scanner.close();
    }

}
