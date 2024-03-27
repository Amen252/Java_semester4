import java.util.Scanner;

public class EvcPlusProject {
    public static void main(String[] args) {
        int pin = 2345; // example pin
        int balance = 100;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fadlan Geli Pinkaaga: ");
        int enteredPin = scanner.nextInt();

        if (enteredPin == pin) {
            System.out.println("1: itus haraagaga");
            System.out.println("2: kaarka hadalka");
            System.out.println("3: bixi bill");
            System.out.println("4: U wareeji Evcplus");
            System.out.println("5: Warbixin kooban");
            System.out.println("6: Salaam Bank");
            System.out.println("7: Maareynta");
            System.out.println("8: Taaj");
            System.out.println("9: Bill payment");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Haraagagu waa $" + balance);
                    break;
                case 2:
                    System.out.println("1: ku shubo");
                    System.out.println("2: ugu shub airtime");
                    System.out.println("3: MIFI package");
                    System.out.println("4: ku shubo internet");
                    System.out.println("5: ugu qof kale (MMT)");
                    System.out.print("Enter your choice: ");
                    int subChoice = scanner.nextInt();
                    switch (subChoice) {
                        case 1:
                            System.out.print("Fadlan Geli lacagta: $");
                            int withdrawAmount = scanner.nextInt();
                            System.out.print("Fadlan Geli Mobile-ka numberkaaga: ");
                            long phoneNumber = scanner.nextLong();
                            System.out.print("Ma hubtaaa inaad $" + withdrawAmount + " ugu shubtid " + phoneNumber + "? (haa/maya): ");
                            String confirmation = scanner.next();
                            if (confirmation.equalsIgnoreCase("haa")) {
                                if (withdrawAmount <= balance) {
                                    balance -= withdrawAmount;
                                    System.out.println("Shubidh lacagta waa ballanqaad. Haraagtaada kordhinaayo: $" + balance);
                                } else {
                                    System.out.println("Lacagta kama jiro.");
                                }
                            } else if (confirmation.equalsIgnoreCase("maya")) {
                                System.out.println("Thank you!");
                            } else {
                                System.out.println("Shubidda laa baahnaa.");
                            }
                            break;
                        case 2:
                            System.out.print("Fadlan Geli Mobile-ka numberkaaga: ");
                            long phoneNumberAirtime = scanner.nextLong();
                            System.out.print("Fadlan Geli lacagta: $");
                            int airtimeAmount = scanner.nextInt();
                            System.out.print("Ma hubtaaa inaad $" + airtimeAmount + " ugu shubtid " + phoneNumberAirtime + "? (haa/maya): ");
                            String confirmationAirtime = scanner.next();
                            if (confirmationAirtime.equalsIgnoreCase("haa")) {
                                if (airtimeAmount <= balance) {
                                    balance -= airtimeAmount;
                                    System.out.println("Shubidh lacagta waa ballanqaad. Haraagtaada kordhinaayo: $" + balance);
                                } else {
                                    System.out.println("Lacagta kama jiro.");
                                }
                            } else if (confirmationAirtime.equalsIgnoreCase("maya")) {
                                System.out.println("Thank you!");
                            } else {
                                System.out.println("Shubidda laa baahnaa.");
                            }
                            break;
                        // Handle other sub-choices
                        case 3:
                            // Handle MIFI package
                            break;
                        case 4:
                            // Handle ku shubo internet
                            break;
                        case 5:
                            // Handle ugu qof kale (MMT)
                            break;
                        default:
                            System.out.println("Invalid sub-choice.");
                    }
                    break;
                case 3:
                    // Handle bixi bill
                    break;
                case 4:
                    // Handle U wareeji Evcplus
                    break;
                case 5:
                    // Handle Warbixin kooban
                    break;
                case 6:
                    // Handle Salaam Bank
                    break;
                case 7:
                    // Handle Maareynta
                    break;
                case 8:
                    // Handle Taaj
                    break;
                case 9:
                    // Handle Bill payment
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } else {
            System.out.println("Incorrect pin.");
        }
    }
}
