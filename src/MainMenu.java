import java.util.Scanner;

public class MainMenu {

    public static void mainMenu() {

    String line = "";
    Scanner scanner = new Scanner(System.in);

    printMainMenu();

        try {
            line = scanner.nextLine();

            if (line.length() == 1) {
                switch (line.charAt(0)) {
                    case '1':
                        System.out.println("Enter name:");
                        String name = scanner.nextLine();
                        System.out.println("Enter surname:");
                        String surname = scanner.nextLine();
//                      TODO  service.registerGuest(name, surname);
                        break;
                    case '2':
                        System.out.println("Enter room number to checkout:");
                        int roomNumber = scanner.nextInt();
//                      TODO  service.checkoutGuest(roomNumber);
                        break;
                    case '3':
//                      TODO  service.reviewOccupancy();
                        break;
                    case '4':
//                      TODO  service.roomHistory();
                        break;
                    case '5':
//                      TODO  service.roomHistory();
                        break;
                    case '6':
                        System.out.println("Exit");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 6.\n");
                        break;
                }
            } else {
                System.out.println("Error: Invalid action\n");
            }
    } catch (StringIndexOutOfBoundsException ex) {
        System.out.println("Empty input received. Exiting program...");
    }
}

public static void printMainMenu()
{
    System.out.print("Welcome to PJ Hotel Guest Registration\n" +
            "--------------------------------------------\n" +
            "1. Register a Guest\n" +
            "2. Checkout the Guest\n" +
            "3. Review Room Occupancy\n" +
            "4. Room History\n" +
            "5. Room Status\n" +
            "6. Exit\n" +
            "--------------------------------------------\n" +
            "Please select a number for the menu option:\n");
}
}
