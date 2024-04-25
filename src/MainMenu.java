import service.HotelService;

import java.util.Scanner;

public class MainMenu {

    public static void mainMenu() {

        HotelService hotelService = new HotelService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print(
                    "--------------------------------------------\n" +
                    "1. Register a Guest\n" +
                    "2. Checkout the Guest\n" +
                    "3. Review Room Occupancy\n" +
                    "4. Room History\n" +
                    "5. Room Status\n" +
                    "6. Exit\n" +
                    "--------------------------------------------\n" +
                    "Please select a number for the menu option:\n");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter name: ");
                    String name = scanner.next();
                    System.out.println("Enter surname: ");
                    String surname = scanner.next();
                    hotelService.registerGuest(name, surname);
                    break;
                case 2:
                    System.out.println("Enter room number to checkout:");
                    int roomNumber = scanner.nextInt();
                    hotelService.checkoutGuest(roomNumber);
                    break;
                case 3:
                    hotelService.reviewOccupancy();
                    break;
                case 4:
                    hotelService.roomHistory();
                    break;
                case 5:
                    hotelService.roomStatus();
                    break;
                case 6:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.\n");
                    break;
            }
        }
    }
}