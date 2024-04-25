import service.HotelService;

import java.util.Scanner;

public class MainMenu {

    public static void mainMenu() {

    HotelService hotelService = new HotelService();
    Scanner scanner = new Scanner(System.in);
    String line = "";

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
                        hotelService.registerGuest(name, surname);
                        break;
                    case '2':
                        System.out.println("Enter room number to checkout:");
                        int roomNumber = scanner.nextInt();
                        hotelService.checkoutGuest(roomNumber);
                        break;
                    case '3':
                        hotelService.reviewOccupancy();
                        break;
                    case '4':
                        hotelService.roomStatus();
                        break;
                    case '5':
                        hotelService.roomHistory();
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
